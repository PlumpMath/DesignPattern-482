/********************************************************************
 * File Name:    ConfigModel.java
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
public class ConfigModel
{

  private boolean needGenPresentation = true;
  private boolean needGenBusiness = true;
  private boolean needGenDao = true;

  public boolean isNeedGenPresentation()
  {
    return needGenPresentation;
  }

  public void setNeedGenPresentation(boolean needGenPresentation)
  {
    this.needGenPresentation = needGenPresentation;
  }

  public boolean isNeedGenBusiness()
  {
    return needGenBusiness;
  }

  public void setNeedGenBusiness(boolean needGenBusiness)
  {
    this.needGenBusiness = needGenBusiness;
  }

  public boolean isNeedGenDao()
  {
    return needGenDao;
  }

  public void setNeedGenDao(boolean needGenDao)
  {
    this.needGenDao = needGenDao;
  }

}
