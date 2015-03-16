/********************************************************************
 * File Name:    Facade.java
 *
 * Date Created: 2015年3月16日
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package facade.designpattern.com;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class Facade
{
  private Facade()
  {

  }

  public static void generate()
  {
    new Presentation().generate();
    new DAO().generate();
    new Business().generate();
  }

}
