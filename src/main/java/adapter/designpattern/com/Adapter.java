/********************************************************************
 * File Name:    Adapter.java
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
public class Adapter implements LogDbOperateApi
{
  private LogFileOperationApi adaptee;

  public Adapter(LogFileOperationApi adaptee)
  {
    this.adaptee = adaptee;
  }

  public void createLog(LogModel logModel)
  {
    List<LogModel> list = adaptee.readLogFile();
    list.add(logModel);
    adaptee.writeLogFile(list);

  }

  public void updateLog(LogModel logModel)
  {
    List<LogModel> list = adaptee.readLogFile();
    for (int i = 0; i < list.size(); i++)
    {
      if (list.get(i).getLogId().equals(logModel.getLogId()))
      {
        list.set(i, logModel);
        break;
      }
    }
    adaptee.writeLogFile(list);

  }

  public void removeLog(LogModel logModel)
  {
    List<LogModel> list = adaptee.readLogFile();
    list.remove(logModel);
    adaptee.writeLogFile(list);

  }

  public List<LogModel> getAllLog()
  {
    // TODO Auto-generated method stub
    return adaptee.readLogFile();
  }

}
