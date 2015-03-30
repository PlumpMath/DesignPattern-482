/********************************************************************
 * File Name:    Leaf.java
 *
 * Date Created: 2015年3月27日
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package composite.designpattern.com;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class Leaf extends Component
{
  private String name = "";

  public void printStruct(String preStr)
  {
    System.out.println(preStr + "-" + name);

  }

  public Leaf(String name)
  {
    this.name = name;
  }

}
