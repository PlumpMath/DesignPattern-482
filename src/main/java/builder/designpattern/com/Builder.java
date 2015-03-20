/********************************************************************
 * File Name:    Builder.java
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
public interface Builder
{
  void buildHeader(ExportHeaderModel ehm);

  void buildBody(Map<String, Collection<ExportDataModel>> mapData);

  void buildFooter(ExportFooterModel efm);
}
