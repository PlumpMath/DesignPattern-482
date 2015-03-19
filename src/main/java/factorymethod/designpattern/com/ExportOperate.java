/********************************************************************
 * File Name:    ExportOperate.java
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
public abstract class ExportOperate
{
  public boolean export(String data)
  {
    ExportFileApi api = factoryMethod();
    return api.export(data);
  }

  protected abstract ExportFileApi factoryMethod();
}
