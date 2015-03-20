/********************************************************************
 * File Name:    ExportToTxt.java
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
public class TxtBuilder implements Builder
{
  private StringBuilder buffer = new StringBuilder();

  public void buildBody(Map<String, Collection<ExportDataModel>> mapData)
  {
    for (String s : mapData.keySet())
    {
      buffer.append(s + "\n");
      for (ExportDataModel edm : mapData.get(s))
      {
        buffer.append(edm.getProductID() + "," + edm.getPrice() + "\n");
      }
    }

  }

  public void buildFooter(ExportFooterModel efm)
  {
    buffer.append(efm.getExportUser());
  }

  public void buildHeader(ExportHeaderModel ehm)
  {
    buffer.append(ehm.getDepID() + ", " + ehm.getExportDate() + "\n");
  }

  public StringBuilder getResult()
  {
    return buffer;
  }

}
