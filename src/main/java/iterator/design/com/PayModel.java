/********************************************************************
 * File Name:    PayModel.java
 *
 * Date Created: 2015年3月26日
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package iterator.design.com;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class PayModel
{
  private String userName;
  private double pay;

  public final String getUserName()
  {
    return userName;
  }

  public final void setUserName(String userName)
  {
    this.userName = userName;
  }

  public final double getPay()
  {
    return pay;
  }

  public final void setPay(double pay)
  {
    this.pay = pay;
  }

  @Override
  public String toString()
  {
    return "PayModel [userName=" + userName + ", pay=" + pay + "]";
  }

}
