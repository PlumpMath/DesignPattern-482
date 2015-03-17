/********************************************************************
 * File Name:    LogModel.java
 *
 * Date Created: 2015年3月17日
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package adapter.designpattern.com;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class LogModel implements java.io.Serializable
{
  private String logId;
  private String operateUser;
  private String operateTime;
  private String logContent;

  public String getLogId()
  {
    return logId;
  }

  public void setLogId(String logId)
  {
    this.logId = logId;
  }

  public String getOperateUser()
  {
    return operateUser;
  }

  public void setOperateUser(String operateUser)
  {
    this.operateUser = operateUser;
  }

  public String getOperateTime()
  {
    return operateTime;
  }

  public void setOperateTime(String operateTime)
  {
    this.operateTime = operateTime;
  }

  public String getLogContent()
  {
    return logContent;
  }

  public void setLogContent(String logContent)
  {
    this.logContent = logContent;
  }

  @Override
  public String toString()
  {
    return "LogModel [logId=" + logId + ", operateUser=" + operateUser + ", operateTime=" + operateTime + ", logContent="
        + logContent + "]";
  }

}
