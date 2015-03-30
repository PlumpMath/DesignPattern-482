/********************************************************************
 * File Name:    ArrayIteratorImpl.java
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
public class ArrayIteratorImpl implements Iterator
{
  private SalaryManager aggregate = null;
  private int index = -1;

  public ArrayIteratorImpl(SalaryManager aggregate)
  {
    this.aggregate = aggregate;
  }

  public void first()
  {
    index = 0;

  }

  public void next()
  {
    if (index < this.aggregate.size())
      index++;

  }

  public boolean isDone()
  {
    if (index == this.aggregate.size())
      return true;
    return false;
  }

  public Object currentItem()
  {
    // TODO Auto-generated method stub
    return aggregate.get;
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
