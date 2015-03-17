/********************************************************************
 * File Name:    EnumSingleton.java
 *
 * Date Created: 2015年3月17日
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package singleton.designpattern.com;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public enum EnumSingleton
{
  uniqueInstance;
  public void singleonOperation()
  {
    System.out.println("This is a singleon instance from Enum method");
  }

}
