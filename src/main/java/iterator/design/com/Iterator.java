/********************************************************************
 * File Name:    Iterator.java
 *
 * Date Created: 2015年3月26日
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package iterator.design.com;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public interface Iterator
{
  void first();

  void next();

  boolean isDone();

  Object currentItem();
}
