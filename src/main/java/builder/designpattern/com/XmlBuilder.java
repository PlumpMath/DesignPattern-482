/********************************************************************
 * File Name:    XmlBuilder.java
 *
 * Date Created: 2015年3月19日
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package builder.designpattern.com;

import java.util.Collection;
import java.util.Map;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class XmlBuilder implements Builder
{
  private StringBuilder buffer = new StringBuilder("Create XML file");

  public void buildHeader(ExportHeaderModel ehm)
  {
    // TODO Auto-generated method stub

  }

  public void buildBody(Map<String, Collection<ExportDataModel>> mapData)
  {
    // TODO Auto-generated method stub

  }

  public void buildFooter(ExportFooterModel efm)
  {
    // TODO Auto-generated method stub

  }

  public StringBuilder getResult()
  {
    return buffer;
  }

}
