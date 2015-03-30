/********************************************************************
 * File Name:    NormalLogin.java
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
public class NormalLogin extends LoginTemplate
{

  @Override
  public LoginModel findLoginUser(String loginId)
  {
    LoginModel lm = new LoginModel();
    lm.setLoginId(loginId);
    lm.setPwd("password");
    return lm;
  }
  // CONSTANTS ------------------------------------------------------

  // CLASS VARIABLES ------------------------------------------------

  // INSTANCE VARIABLES ---------------------------------------------

  // CONSTRUCTORS ---------------------------------------------------

  // PUBLIC METHODS -------------------------------------------------

  // PROTECTED METHODS ----------------------------------------------

  // PRIVATE METHODS ------------------------------------------------

  // ACCESSOR METHODS -----------------------------------------------

}
