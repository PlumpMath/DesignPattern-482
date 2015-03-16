/********************************************************************
 * File Name:    SimpleFactory.java
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
public class SimpleFactoryByParam
{

  public static SimpleFactoryInterface creatSimpleFactory(int condition)
  {
    SimpleFactoryInterface sf = null;
    if (condition == 0)
    {
      sf = new SimpleFactoryImplA();
    }
    else if (condition == 1)
    {
      sf = new SimpleFactoryImplB();
    }
    return sf;
  }

}
