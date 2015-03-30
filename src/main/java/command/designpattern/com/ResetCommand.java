/********************************************************************
 * File Name:    ResetCommand.java
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
public class ResetCommand implements Command
{
  private MainBoardApi mainBoard = null;

  public ResetCommand(MainBoardApi mainBoard)
  {
    this.mainBoard = mainBoard;
  }

  public void execute()
  {
    mainBoard.reset();

  }
  // CONSTANTS ------------------------------------------------------

  // CLASS VARIABLES ------------------------------------------------

  // INSTANCE VARIABLES ---------------------------------------------

  // CONSTRUCTORS ---------------------------------------------------

  // PUBLIC METHODS -------------------------------------------------

  // PROTECTED METHODS ----------------------------------------------

  // PRIVATE METHODS ------------------------------------------------

  // ACCESSOR METHODS -----------------------------------------------

}
