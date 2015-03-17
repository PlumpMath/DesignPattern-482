/********************************************************************
 * File Name:    Client.java
 *
 * Date Created: 2015年3月17日
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package adapter.designpattern.com;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class Client
{
  public static void main(String[] args)
  {
    LogModel logModel = new LogModel();
    logModel.setLogId("001");
    logModel.setOperateUser("Emma");
    logModel.setOperateTime("2015-03-17");
    logModel.setLogContent("Test for Adapter Design Pattern");

    List<LogModel> list = new ArrayList<LogModel>();
    list.add(logModel);

    LogFileOperationApi logFileapi = new LogFileOperate("");
    LogDbOperateApi api = new Adapter(logFileapi);
    api.createLog(logModel);

    List<LogModel> readLog = api.getAllLog();
    System.out.println(readLog);
  }

}
