/********************************************************************
 * File Name:    ExportHeaderModel.java
 *
 * Date Created: 2015年3月19日
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package builder.designpattern.com;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class ExportHeaderModel
{
  private String depID;
  private String exportDate;

  public String getDepID()
  {
    return depID;
  }

  public void setDepID(String depID)
  {
    this.depID = depID;
  }

  public String getExportDate()
  {
    return exportDate;
  }

  public void setExportDate(String exportDate)
  {
    this.exportDate = exportDate;
  }

}
