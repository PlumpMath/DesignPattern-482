/********************************************************************
 * File Name:    Director.java
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
public class Director
{
  private Builder builder;

  public Director(Builder builder)
  {
    this.builder = builder;
  }

  public void construct(ExportHeaderModel ehm, Map<String, Collection<ExportDataModel>> mapData, ExportFooterModel efm)
  {
    builder.buildHeader(ehm);
    builder.buildBody(mapData);
    builder.buildFooter(efm);
  }

}
