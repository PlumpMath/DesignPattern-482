/********************************************************************
 * File Name:    ExportDataModel.java
 *
 * Date Created: 2015年3月19日
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package builder.designpattern.com;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class ExportDataModel
{
  private String productID;
  private int price;

  public String getProductID()
  {
    return productID;
  }

  public void setProductID(String productID)
  {
    this.productID = productID;
  }

  public int getPrice()
  {
    return price;
  }

  public void setPrice(int price)
  {
    this.price = price;
  }

}
