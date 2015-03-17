/********************************************************************
 * File Name:    LogFileOperate.java
 *
 * Date Created: 2015年3月17日
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package adapter.designpattern.com;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class LogFileOperate implements LogFileOperationApi
{
  private String logFilePathName = "AdapterLog.log";

  public LogFileOperate(String logFilePathName)
  {
    if (logFilePathName != null && logFilePathName.trim().length() > 0)
    {
      this.logFilePathName = logFilePathName;
    }
  }

  public List<LogModel> readLogFile()
  {
    List<LogModel> list = null;
    ObjectInputStream oin = null;
    try
    {
      File f = new File(logFilePathName);
      if (f.exists())
      {
        oin = new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)));
      }
      list = (List<LogModel>) oin.readObject();

    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
    finally
    {
      try
      {
        if (oin != null)
          oin.close();
      }
      catch (IOException e)
      {
        e.printStackTrace();
      }
      return list;
    }
  }

  public void writeLogFile(List<LogModel> list)
  {
    File f = new File(logFilePathName);
    ObjectOutputStream oout = null;
    try
    {
      oout = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f)));
      oout.writeObject(list);
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
    finally
    {
      try
      {
        oout.close();
      }
      catch (IOException e)
      {
        e.printStackTrace();
      }
    }
  }
}
