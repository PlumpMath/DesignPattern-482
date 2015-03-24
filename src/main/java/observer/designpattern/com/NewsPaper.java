/********************************************************************
 * File Name:    NewsPaper.java
 *
 * Date Created: 2015年3月24日
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package observer.designpattern.com;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class NewsPaper extends Subject
{
  private String content;

  public String getContent()
  {
    return content;
  }

  public void setContent(String content)
  {
    this.content = content;
    notifyObservers();
  }
}
