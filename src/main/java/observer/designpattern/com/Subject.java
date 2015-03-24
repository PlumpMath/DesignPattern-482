/********************************************************************
 * File Name:    Subject.java
 *
 * Date Created: 2015年3月24日
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package observer.designpattern.com;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class Subject
{
  private List<Observer> readers = new ArrayList<Observer>();

  public void attach(Observer reader)
  {
    readers.add(reader);
  }

  public void detach(Observer reader)
  {
    readers.remove(reader);
  }

  protected void notifyObservers()
  {
    for (Observer reader : readers)
    {
      reader.update(this);
    }
  }
}
