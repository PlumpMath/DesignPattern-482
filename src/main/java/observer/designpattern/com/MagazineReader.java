/********************************************************************
 * File Name:    MagazineReader.java
 *
 * Date Created: 2015年3月24日
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package observer.designpattern.com;

import java.util.Observable;
import java.util.Observer;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class MagazineReader implements Observer
{
  private String name;

  public MagazineReader(String name)
  {
    this.name = name;
  }

  public void update(Observable arg0, Object arg1)
  {
    // push mode
    System.out.println(name + " Recieve magazine in push mode  " + arg1);

    // pull mode
    System.out.println(name + " Recieve magazine in pull mode  " + ((Magazine) arg0).getContent());

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
