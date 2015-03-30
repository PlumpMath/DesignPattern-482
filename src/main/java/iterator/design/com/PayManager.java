/********************************************************************
 * File Name:    PayManager.java
 *
 * Date Created: 2015年3月26日
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package iterator.design.com;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class PayManager
{
  private List list = new ArrayList();

  public List getPayList()
  {
    return list;
  }

  public void calcPay()
  {
    PayModel pm1 = new PayModel();
    pm1.setPay(30);
    pm1.setUserName("Emma");
    list.add(pm1);
    PayModel pm2 = new PayModel();
    pm2.setPay(40);
    pm1.setUserName("Agnes");
    list.add(pm2);

  }

  public int size()
  {
    return list.size();
  }
}
