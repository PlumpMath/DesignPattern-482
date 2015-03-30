/********************************************************************
 * File Name:    Composite.java
 *
 * Date Created: 2015年3月27日
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package composite.designpattern.com;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class Composite extends Component
{

  private List<Component> childComponents = null;

  private String name = "";

  public Composite(String name)
  {
    this.name = name;
  }

  @Override
  public void printStruct(String preStr)
  {
    System.out.println(preStr + "+" + name);
    if (childComponents != null)
    {
      preStr += " ";
      for (Component c : childComponents)
      {
        c.printStruct(preStr);
      }
    }

  }

  @Override
  public void addChild(Component child)
  {
    if (childComponents == null)
    {
      childComponents = new ArrayList<Component>();
    }
    childComponents.add(child);
  }

}
