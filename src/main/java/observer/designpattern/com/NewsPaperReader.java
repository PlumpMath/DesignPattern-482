/********************************************************************
 * File Name:    Reader.java
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
public class NewsPaperReader implements Observer
{

  private String content;
  private String name;

  public NewsPaperReader(String name)
  {
    this.name = name;
  }

  public void update(Subject subject)
  {
    content = ((NewsPaper) subject).getContent();
    System.out.println("the latest content is " + content);
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

}
