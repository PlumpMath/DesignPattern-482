/********************************************************************
 * File Name:    ConcreteMediator.java
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
public class ConcreteMediator implements Mediator
{
  private ConcreateColleagueA colleagueA;
  private ConcreateColleagueB colleagueB;

  public void changed(Colleague colleague)
  {
    // TODO Auto-generated method stub

  }

  public void setColleagueA(ConcreateColleagueA colleagueA)
  {
    this.colleagueA = colleagueA;
  }

  public void setColleagueB(ConcreateColleagueB colleagueB)
  {
    this.colleagueB = colleagueB;
  }

}
