package edu.depauw.csc232;

public class Pawn {
   
   // This class is designed to implement and keep track of all elements that the "Pawn"
   // game piece might possess. These include things like position on the board, whether it
   // is in a base or not, if it can use a "slide" board piece, and if it can move out of the 
   // home or not.

   public int xgetPosition() {
      // Returns the given position on the board that a pawn is located.
      return xposition;
   }
   public int ygetPosition() {
      // Returns the given position on the board that a pawn is located.
      return yposition;
   }

   public void setPosition(int xposition, int yposition) {
      // Sets a pawns position to a new position
      this.xposition = xposition;
      this.yposition = yposition;
   }
   
   public void Start( int playernum )
   {
      if (playernum == 1)
      {
         pawn.setPosition(4,0);
      }
      else if (playernum == 2)
         
      {
         pawn.setPosition(15,4);
      }
      else if (playernum==3)
      {
         pawn.setPosition(0,11);
      }
      else if(playernum == 4)
      {
         pawn.setPosition(11,15);
      }
   }
   public void move(Card newCard, Pawn pawn)
   {
      // Moves the pawn to a different location on the board depending on the number on the
      // card that was drawn.
     //pawn.position = pawn.position + newCard.getNum();
   }
   
   private int xposition;
   private int yposition;
   private int 
   
   
   /*-has position
   -
   -switch move
   -sorry
   -slide
   -outOfBase
   -intoHome
   */
}
