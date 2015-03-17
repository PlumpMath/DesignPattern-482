/********************************************************************
 * File Name:    LogDbOperateApi.java
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
public interface LogDbOperateApi
{
  void createLog(LogModel logModel);

  void updateLog(LogModel logModel);

  void removeLog(LogModel logModel);

  List<LogModel> getAllLog();
}
