/********************************************************************
 * File Name:    Client.java
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
public class Client
{
  public static void main(String[] args)
  {
    Box box = new Box();
    MainBoardApi mainBoard = new MsiMainBoard();
    Command openCommand = new OpenCommand(mainBoard);
    Command resetCommand = new ResetCommand(mainBoard);
    box.setOpenCommand(openCommand);
    box.setResetCommand(resetCommand);
    box.openButtenPressed();
    box.resetButtenPressed();

    openCommand = new OpenCommand(new GigaMainBoard());
    box.setOpenCommand(openCommand);
    box.openButtenPressed();
  }

}
