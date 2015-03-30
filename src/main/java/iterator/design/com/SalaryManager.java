/********************************************************************
 * File Name:    SalaryManager.java
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
public class SalaryManager
{
  private PayModel[] pms = new PayModel[2];

  public PayModel[] getPays()
  {
    return pms;
  }

  public void calcPay()
  {
    PayModel pm1 = new PayModel();
    pm1.setPay(30);
    pm1.setUserName("Emma");
    pms[0] = pm1;
    PayModel pm2 = new PayModel();
    pm2.setPay(40);
    pm1.setUserName("Agnes");
    pms[2] = pm2;

  }

  public int size()
  {
    return pms.length;
  }

}
