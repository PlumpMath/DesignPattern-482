/********************************************************************
 * File Name:    Client.java
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
public class Client
{
  public static void main(String[] args)
  {
    Component root = new Composite("Director");
    Component c1 = new Composite("Manager 1");
    Component c2 = new Composite("Manager 2");

    Component e1 = new Leaf("Employee A");
    Component e2 = new Leaf("Employee B");
    Component e3 = new Leaf("Employee C");
    Component e4 = new Leaf("Employee D");
    Component e5 = new Leaf("Employee E");

    root.addChild(c1);
    root.addChild(c2);

    c1.addChild(e1);
    c1.addChild(e2);

    c2.addChild(e3);
    c2.addChild(e4);
    c2.addChild(e5);

    root.printStruct("");

  }
}
