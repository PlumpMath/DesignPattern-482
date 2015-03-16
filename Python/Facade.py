from fileinput import filename
from zipfile import ZipFile
import os
import tarfile
import string
import re
import gzip

class Archive:
    def __init__(self, filename):
        self._names = None;
        self._unpack = None;
        self._file = None;
        self._filename = filename;
    @property 
    def filename(self):
        return self._filename
    
    @filename.setter
    def filename(self,name):
        self.close()
        self._filename = name
    
    def close(self):
        if self._file is not None:
            self._file.close()
        self._name =self._unpack = self._file = None
    
    def __enter__(self):
        return self
    
    def __exit__(self, exc_type, exc_value, traceback):
        self.close()
        
    def names(self):
        if self._file is None:
            self._prepare()
        return self._names()
    
    def unpack(self):
        if self._file is None:
            self._prepare()
        self._unpack()
        
    def _prepare(self):
        if self.filename.endswith((".tar.gz", ".tar.bz2", ".tar.xz", ".zip")):
            self._prepare_tarball_or_zip()
        elif self.filename.endswith(".gz"):
            self._prepare_gzip()
        else:
            raise ValueError("Unreadable:{}".format(self.filename))
        
    def _prepare_tarball_or_zip(self):
        def safe_extractall():
            unsafe = []
            for name in self.names():
                if not self.is_safe(name):
                    unsafe.append(name)
            if unsafe:
                raise ValueError("Unsafe to unpack:{}".format(unsafe))
            self._file.extractall()
        if self.filename.endswith(".zip"):
            self._file = ZipFile(self.filename)
            self._names = self._file.namelist
            self._unpack = safe_extractall
        else:
            suffix = os.path.splitext(self.filename)[1]
            self._file = tarfile.open(self.filename, "r:" + suffix[1:])
            self._names = self._file.getnames
            self._unpack = safe_extractall
        
    def is_safe(self, filename):
        return not (filename.startswith(("/", "\\")) or
            (len(filename) > 1 and filename[1] == ":" and
             filename[0] in string.ascii_letters) or
            re.search(r"[.][.][/\\]", filename))                
    
    def _prepare_gzip(self):
        self._file = gzip.open(self.filename)
        filename = self.filename[:-3]
        self._names = lambda: [filename]
        def extractall():
            with open(filename, "wb") as file:
                file.write(self._file.read())
        self._unpack = extractall    
        
if __name__ == "__main__":
    zipFilename = "test.zip"
    with Archive(zipFilename) as archive:
        print(archive.names())
        archive.unpack()
    