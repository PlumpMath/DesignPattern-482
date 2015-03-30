/********************************************************************
 * File Name:    LoginTemplate.java
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
public abstract class LoginTemplate
{
  public final boolean login(LoginModel loginModel)
  {
    LoginModel dbLm = findLoginUser(loginModel.getLoginId());
    if (dbLm != null)
    {
      String encryptPwd = encryptPwd(loginModel.getPwd());
      loginModel.setPwd(encryptPwd);
      return match(loginModel, dbLm);
    }
    return false;
  }

  public abstract LoginModel findLoginUser(String loginId);

  public String encryptPwd(String pwd)
  {
    return pwd;
  }

  public boolean match(LoginModel lm, LoginModel dbLm)
  {
    if (lm.getLoginId().equals(dbLm.getLoginId()) && lm.getPwd().equals(dbLm.getPwd()))
      return true;
    return false;
  }
}
