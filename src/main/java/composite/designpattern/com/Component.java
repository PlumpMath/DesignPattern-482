/********************************************************************
 * File Name:    Component.java
 *
 * Date Created: 2015年3月27日
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package composite.designpattern.com;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public abstract class Component
{
  public abstract void printStruct(String preStr);

  public void addChild(Component child)
  {
    throw new UnsupportedOperationException("Can't support this function");
  }

  public void removeChild(Component child)
  {
    throw new UnsupportedOperationException("Can't support this function");
  }

  public void getChild(Component child)
  {
    throw new UnsupportedOperationException("Can't support this function");
  }
}
