/********************************************************************
 * File Name:    OrderApi.java
 *
 * Date Created: 2015年3月23日
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package prototype.designpattern.com;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public interface OrderApi
{
  int getOrderProductNum();

  void setOrderProductNum(int num);

  public OrderApi cloneOrder();
}
