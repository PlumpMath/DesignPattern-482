/********************************************************************
 * File Name:    Client.java
 *
 * Date Created: 2015年3月17日
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package singleton.designpattern.com;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class Client
{
  public static void main(String[] args)
  {
    AppConfig config = AppConfig.getInstance();
    String paramA = config.getParameterA();
    String paramB = config.getParameterB();
    System.out.println("ParmaA = " + paramA + ", ParamB = " + paramB);

    EnumSingleton enumSingleton = EnumSingleton.uniqueInstance;
    enumSingleton.singleonOperation();
  }

}
