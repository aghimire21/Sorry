package edu.depauw.csc232;

import java.lang.reflect.Array;

public class Board {
   // This is the class that will house all the information about the board. 
   // It will have a set number of spaces, bases, and identify a home for each player.

   public void createBoard()
   {
      // This method will be used to create the initial instance of the board
   }


   public Array[] getSpaces() {
      return spaces;
   }


   public void setSpaces(Array[] spaces) {
      this.spaces = spaces;
   }
   
   /*-has slides
-has spaces
-has base
-has home*/
   
   private Array spaces[] = new Array [53];
}
