package edu.depauw.csc232;

// This method implements and keeps track of all the actions that a player could make, as well
// as some characteristics that are specific to the player, such as their color.
public class Player {

   public void startGame()
   {
      // This method initiates that game for the player and creates all of its assets.
   }
   
   public String getColor() {
      // Returns the color of the players pieces 
      return color;
   }

   public void setColor(String color) {
      // Sets the players color to a specific color.
      this.color = color;
   }


   public Pawn pickPawnToMove(Pawn pawn)
   {
      // This method returns the specific pawn that the player decides to move
      return pawn;
   }
   
   public Card drawCard()
   {
      // This method allows the player to draw a card from the deck and returns the cards 
      // information
      Card newCard = cdeck.drawCard();
      return newCard;
   }
   
   public Pawn pickPawnToSorry()
   {
      // This method allows the player to choose an opponents piece that the want to "Sorry"
      // and returns that pawn
      Pawn pawn = null;
      return pawn;
   }
   
   public void swapPawns(Pawn pawn1, Pawn pawn2)
   {
      // This method swaps the position values of two pawns on the board
      int save = pawn1.getPosition();
      pawn2.setPosition(pawn1.getPosition());
      pawn1.setPosition(save);
   }
   
   
   private String color;
   private Deck cdeck = new Deck();
   
   
 
   /*-has 4 pawns
-drawCard
-pickPawnToMove
-pickPawnToSorry
-splitMove(7card)
-ForwardOrBackward(10 card)
-drawAgain(2 card)
-moveOutOfBase(1 or 2 card)
-chooseColor
-swapPawns(11 card)
*/
   
}
