/********************************************************************
 * File Name:    ConfigManager.java
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
public class ConfigManager
{
  private static ConfigManager manager = null;
  private static ConfigModel configModel = null;

  private ConfigManager()
  {

  }

  public static ConfigManager getInstance()
  {
    if (manager == null)
    {
      manager = new ConfigManager();
      configModel = new ConfigModel();
    }
    return manager;
  }

  public ConfigModel getConfigModel()
  {
    return configModel;
  }
}
