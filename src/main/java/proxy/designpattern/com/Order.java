/********************************************************************
 * File Name:    Order.java
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
public class Order implements OrderApi
{
  private String productName;
  private int orderNum;
  private String orderUser;

  public Order(String productName, int orderNum, String orderUser)
  {
    this.productName = productName;
    this.orderNum = orderNum;
    this.orderUser = orderUser;
  }

  public int getOrderProductNum()
  {
    // TODO Auto-generated method stub
    return orderNum;
  }

  public void setOrderProductNum(int num)
  {
    this.orderNum = num;

  }

  public String getProductName()
  {
    // TODO Auto-generated method stub
    return productName;
  }

  public void setProductName(String productName, String user)
  {
    this.productName = productName;

  }

  public int getOrderNum()
  {
    // TODO Auto-generated method stub
    return orderNum;
  }

  public void setOrderNum(int orderNum, String user)
  {
    this.orderNum = orderNum;

  }

  public String getOrderUser()
  {
    // TODO Auto-generated method stub
    return orderUser;
  }

  public void setOrderUser(String orderUser, String user)
  {
    this.orderUser = orderUser;

  }

  @Override
  public String toString()
  {
    return "Order [productName=" + productName + ", orderNum=" + orderNum + ", orderUser=" + orderUser + "]";
  }

}
