/********************************************************************
 * File Name:    Magazine.java
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

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class Magazine extends Observable
{
  private String content;

  public final String getContent()
  {
    return content;
  }

  public final void setContent(String content)
  {
    this.content = content;
    this.setChanged();
    // push mode
    this.notifyObservers(this.content);
    // pull mode
    // this.notifyObservers();
  }

  @Override
  public String toString()
  {
    return "Magazine [content=" + content + "]";
  }

}
