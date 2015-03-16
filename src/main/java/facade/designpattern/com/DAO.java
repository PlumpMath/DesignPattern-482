/********************************************************************
 * File Name:    DAO.java
 *
 * Date Created: 2015年3月16日
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package facade.designpattern.com;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class DAO
{
  public void generate()
  {
    ConfigModel configModel = ConfigManager.getInstance().getConfigModel();
    if (configModel.isNeedGenDao())
    {
      System.out.println("Working on generating DAO files");
    }

  }

}
