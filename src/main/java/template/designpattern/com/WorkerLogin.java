/********************************************************************
 * File Name:    WorkerLogin.java
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
public class WorkerLogin extends LoginTemplate
{

  @Override
  public LoginModel findLoginUser(String loginId)
  {
    LoginModel lm = new LoginModel();
    lm.setLoginId(loginId);
    lm.setPwd("workpassword");
    return lm;
  }

  @Override
  public String encryptPwd(String pwd)
  {
    System.out.println("Encrypted by MD5");
    return pwd;
  }

}
