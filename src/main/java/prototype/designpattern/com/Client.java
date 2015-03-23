/********************************************************************
 * File Name:    Client.java
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
public class Client
{

  public static void main(String[] args)
  {
    PersonalOrder personalOrder = new PersonalOrder();
    personalOrder.setCustomerName("Emma");
    personalOrder.setOrderProductNum(3870);
    personalOrder.setProductId("110");

    EnterpriseOrder enterpriseOrder = new EnterpriseOrder();
    enterpriseOrder.setEnterpriseName("Ping");
    enterpriseOrder.setOrderProductNum(1877);
    enterpriseOrder.setProductId("222");

    OrderBusiness orderBusiness = new OrderBusiness();
    orderBusiness.saveOrder(personalOrder);
    orderBusiness.saveOrder(enterpriseOrder);

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
