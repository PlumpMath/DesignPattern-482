/********************************************************************
 * File Name:    LogFileOperationApi.java
 *
 * Date Created: 2015年3月17日
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package adapter.designpattern.com;

import java.util.List;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public interface LogFileOperationApi
{
  public List<LogModel> readLogFile();

  public void writeLogFile(List<LogModel> list);
}
