/********************************************************************
 * File Name:    AppConfig.java
 *
 * Date Created: 2015年3月17日
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package singleton.designpattern.com;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class AppConfig
{
  private String parameterA;
  private String parameterB;
  private static AppConfig instance = new AppConfig();

  public static AppConfig getInstance()
  {
    return instance;
  }

  public String getParameterA()
  {
    return parameterA;
  }

  public String getParameterB()
  {
    return parameterB;
  }

  private AppConfig()
  {
    readConfig(); // TODO Auto-generated constructor stub
  }

  private void readConfig()
  {
    Properties p = new Properties();
    InputStream in = null;
    try
    {
      in = AppConfig.class.getResourceAsStream("AppConfig.properties");
      p.load(in);
      this.parameterA = p.getProperty("paramA");
      this.parameterB = p.getProperty("paramB");
    }
    catch (IOException e)
    {
      System.out.println("Config file is wrong!");
      e.printStackTrace();
    }
    finally
    {
      try
      {
        in.close();
      }
      catch (IOException e)
      {
        e.printStackTrace();
      }
    }
  }
}
