/********************************************************************
 * File Name:    Client.java
 *
 * Date Created: 2015年3月18日
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package factorymethod.designpattern.com;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class Client
{
  public static void main(String[] args)
  {
    ExportOperate operate = new ExportTxtFileOperate();
    String data = "Test for factory method";
    operate.export(data);

    operate = new ExportDBOperate();
    operate.export(data);

  }

}
