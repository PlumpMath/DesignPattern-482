/********************************************************************
 * File Name:    Client.java
 *
 * Date Created: 2015年3月13日
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package simplefactory.designpattern.com;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class Client
{
  public static void main(String[] args)
  {
    SimpleFactoryInterface sf = SimpleFactoryByParam.creatSimpleFactory(0);
    sf.SimpleFactory("Test for Simple Factory Implementation A");
    sf = SimpleFactoryByParam.creatSimpleFactory(1);
    sf.SimpleFactory("Test for Simple Factory Implementation B");
    sf = SimpleFactoryByProperity.creatSimpleFactory();
    sf.SimpleFactory("Test for properities");
  }
}
