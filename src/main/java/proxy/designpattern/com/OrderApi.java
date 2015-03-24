/********************************************************************
 * File Name:    OrderApi.java
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
public interface OrderApi
{
  String getProductName();

  void setProductName(String productName, String user);

  int getOrderNum();

  void setOrderNum(int orderNum, String user);

  String getOrderUser();

  void setOrderUser(String orderUser, String user);
}
