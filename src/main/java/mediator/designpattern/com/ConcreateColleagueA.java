/********************************************************************
 * File Name:    ConcreateColleagueA.java
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
public class ConcreateColleagueA extends Colleague
{

  public ConcreateColleagueA(Mediator mediator)
  {
    super(mediator);
    // TODO Auto-generated constructor stub
  }

  public void someOperation()
  {
    getMediator().changed(this);
  }

}
