/********************************************************************
 * File Name:    Colleague.java
 *
 * Date Created: 2015年3月23日
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package mediator.designpattern.com;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public abstract class Colleague
{
  private Mediator mediator;

  public Colleague(Mediator mediator)
  {
    this.mediator = mediator;
  }

  public Mediator getMediator()
  {
    return mediator;
  }

}
