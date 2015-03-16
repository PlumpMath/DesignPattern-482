/********************************************************************
 * File Name:    SimpleFatoryImpl.java
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
public class SimpleFactoryImplA implements SimpleFactoryInterface
{
  public void SimpleFactory(String s)
  {
    System.out.println("Implements A from SimpleFactoryInterface " + s);
  }

}
