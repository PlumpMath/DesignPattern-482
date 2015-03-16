/********************************************************************
 * File Name:    SimpleFactoryByProperity.java
 *
 * Date Created: 2015年3月13日
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package simplefactory.designpattern.com;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class SimpleFactoryByProperity
{
  public static SimpleFactoryInterface creatSimpleFactory()
  {
    Properties p = new Properties();
    InputStream in = null;

    try
    {
      in = SimpleFactoryByParam.class.getResourceAsStream("SimpleFactory.properties");
      p.load(in);
    }
    catch (IOException e)
    {
      System.out.println("Config file is wrong, the strace as following:");
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

    SimpleFactoryInterface sf = null;

    try
    {
      sf = (SimpleFactoryInterface) Class.forName(p.getProperty("ImplClass")).newInstance();
    }
    catch (InstantiationException e)
    {
      e.printStackTrace();
    }
    catch (IllegalAccessException e)
    {
      e.printStackTrace();
    }
    catch (ClassNotFoundException e)
    {
      e.printStackTrace();
    }

    return sf;

  }
}
