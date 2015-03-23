/********************************************************************
 * File Name:    EnterpriseOrder.java
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
public class EnterpriseOrder implements Cloneable, OrderApi
{
  private String enterpriseName;
  private String productId;
  private int orderProductNum = 0;

  public int getOrderProductNum()
  {
    // TODO Auto-generated method stub
    return this.orderProductNum;
  }

  public void setOrderProductNum(int num)
  {
    this.orderProductNum = num;

  }

  public String getEnterpriseName()
  {
    return enterpriseName;
  }

  public void setEnterpriseName(String enterpriseName)
  {
    this.enterpriseName = enterpriseName;
  }

  public String getProductId()
  {
    return productId;
  }

  public void setProductId(String productId)
  {
    this.productId = productId;
  }

  @Override
  public String toString()
  {
    return "EnterpriseOrder [enterpriseName=" + enterpriseName + ", productId=" + productId + ", orderProductNum="
        + orderProductNum + "]";
  }

  public OrderApi cloneOrder()
  {
    EnterpriseOrder order = new EnterpriseOrder();
    order.setEnterpriseName(this.enterpriseName);
    order.setOrderProductNum(this.orderProductNum);
    order.setProductId(this.productId);
    return order;
  }

  public Object clone()
  {
    Object obj = null;
    try
    {
      obj = super.clone();
    }
    catch (CloneNotSupportedException e)
    {
      e.printStackTrace();
    }
    return obj;
  }

}
