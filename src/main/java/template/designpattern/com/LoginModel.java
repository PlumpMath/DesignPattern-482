/********************************************************************
 * File Name:    LoginModel.java
 *
 * Date Created: 2015年3月30日
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package template.designpattern.com;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class LoginModel
{
  private String loginId;
  private String pwd;

  public String getLoginId()
  {
    return loginId;
  }

  public void setLoginId(String loginId)
  {
    this.loginId = loginId;
  }

  public String getPwd()
  {
    return pwd;
  }

  public void setPwd(String pwd)
  {
    this.pwd = pwd;
  }

}
