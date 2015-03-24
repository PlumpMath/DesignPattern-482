/********************************************************************
 * File Name:    Client.java
 *
 * Date Created: 2015年3月24日
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package observer.designpattern.com;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class Client
{
  public static void main(String[] args)
  {
    NewsPaper newsPaper = new NewsPaper();
    NewsPaperReader reader1 = new NewsPaperReader("Emma");
    NewsPaperReader reader2 = new NewsPaperReader("Agnes");
    NewsPaperReader reader3 = new NewsPaperReader("Coco");

    newsPaper.attach(reader1);
    newsPaper.attach(reader2);
    newsPaper.attach(reader3);

    newsPaper.setContent("New content arrived");

    Magazine magazine = new Magazine();
    MagazineReader magazineReader1 = new MagazineReader("Emma");
    MagazineReader magazineReader2 = new MagazineReader("Agnes");
    MagazineReader magazineReader3 = new MagazineReader("Coco");

    magazine.addObserver(magazineReader1);
    magazine.addObserver(magazineReader2);
    magazine.addObserver(magazineReader3);

    magazine.setContent("New magazine arrived");
  }
}
