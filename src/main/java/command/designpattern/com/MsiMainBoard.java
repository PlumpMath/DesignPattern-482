/********************************************************************
 * File Name:    MsiMainBoard.java
 *
 * Date Created: 2015年3月25日
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package command.designpattern.com;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class MsiMainBoard implements MainBoardApi
{

  public void open()
  {
    System.out.println("MSI main board is working");

  }

  public void reset()
  {
    System.out.println("MSI main board is resetting");

  }

}
