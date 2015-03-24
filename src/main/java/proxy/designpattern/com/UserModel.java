/********************************************************************
 * File Name:    UserModel.java
 *
 * Date Created: 2015年3月24日
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package proxy.designpattern.com;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class UserModel
{
  private String userId;
  private String name;
  private String depId;
  private String sex;

  public String getUserId()
  {
    return userId;
  }

  public void setUserId(String userId)
  {
    this.userId = userId;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getDepId()
  {
    return depId;
  }

  public void setDepId(String depId)
  {
    this.depId = depId;
  }

  public String getSex()
  {
    return sex;
  }

  public void setSex(String sex)
  {
    this.sex = sex;
  }

  @Override
  public String toString()
  {
    return "UserModel [userId=" + userId + ", name=" + name + ", depId=" + depId + ", sex=" + sex + "]";
  }

}
