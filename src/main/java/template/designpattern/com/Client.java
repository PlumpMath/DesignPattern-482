/********************************************************************
 * File Name:    Client.java
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
public class Client
{
  public static void main(String[] args)
  {

    LoginModel lm = new LoginModel();
    lm.setLoginId("admin");
    lm.setPwd("password");

    LoginTemplate lt = new WorkerLogin();
    LoginTemplate lt2 = new NormalLogin();

    boolean flag = lt.login(lm);
    System.out.println("可以登录工作平台=" + flag);

    boolean flag2 = lt2.login(lm);
    System.out.println("可以进行普通人员登录=" + flag2);
  }

}
