/********************************************************************
 * File Name:    Proxy.java
 *
 * Date Created: 2015年3月24日
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package proxy.designpattern.com;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class Proxy implements Subject
{
  private RealSubject realSubject = null;

  public Proxy(RealSubject realSubject)
  {
    this.realSubject = realSubject;
  }

  public void request()
  {
    realSubject.request();

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
