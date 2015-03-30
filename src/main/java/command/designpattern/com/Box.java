/********************************************************************
 * File Name:    Box.java
 *
 * Date Created: 2015年3月25日
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package command.designpattern.com;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class Box
{
  private Command openCommand;
  private Command resetCommand;

  public void setOpenCommand(Command command)
  {
    this.openCommand = command;
  }

  public void openButtenPressed()
  {
    openCommand.execute();
  }

  public void setResetCommand(Command command)
  {
    this.resetCommand = command;
  }

  public void resetButtenPressed()
  {
    resetCommand.execute();
  }
}
