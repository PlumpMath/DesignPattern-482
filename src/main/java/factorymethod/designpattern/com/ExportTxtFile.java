/********************************************************************
 * File Name:    ExportTxtFile.java
 *
 * Date Created: 2015年3月18日
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package factorymethod.designpattern.com;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class ExportTxtFile implements ExportFileApi
{

  public boolean export(String data)
  {
    System.out.println("Export to TXT:" + data);
    return true;
  }
  // CONSTANTS ------------------------------------------------------

  // CLASS VARIABLES ------------------------------------------------

  // INSTANCE VARIABLES ---------------------------------------------

  // CONSTRUCTORS ---------------------------------------------------

  // PUBLIC METHODS -------------------------------------------------

  // PROTECTED METHODS ----------------------------------------------

  // PRIVATE METHODS ------------------------------------------------

  // ACCESSOR METHODS -----------------------------------------------

}
