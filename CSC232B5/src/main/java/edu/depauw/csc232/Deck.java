package edu.depauw.csc232;

import java.util.Random;

public class Deck{
   // This class possesses all the information and classes responsible for both building 
   // and keeping track of the deck of cards, and is linked to the Card class.

   public void buildDeck()
   {
      // This class is responsible for creating the deck with a specific amount of each type of 
      // card inside of it using a for loop and a nested for loop.
      Card card1 = new Card(0,null);
      int index = 0;
      for (int i = 0 ; i<=12 ; i++)
      {
         for (int j=0 ;j<4 ; j++)
         {
            card1.setNum(i);
            card1.setRule(null);
            deck[index] = card1;
            index++;
         }
      }
      Card card2 = new Card (1,null);
      deck[index]=card2;
      top = 0;
   }
   
   
   public void shuffle()
   {
      // This method is responsible for shuffling a newly created deck. This is done by randomly
      // selecting cards from the deck and placing them in a temporary array, the replacing the 
      // original array with the newly created random temp array
      Random r = new Random();
      buildDeck();
      int max = 52;
      for(int i = 0 ; i<52; i++)
      {
         int next = r.nextInt(max);
         Card save = deck[next];
         deck[next]=deck[max];
         deck[max] = save;
         max--;
      }
      top = 0;
   }
   
   public Card drawCard()
   {
      // This method method is responsible for drawing the card for a player.
      // The card is drawn from the deck and the card is removed from the deck array, and returns
      // its game based information
      if(top==53) {
         shuffle();
      }
      Card draw = deck[top];
      top++;
      return draw;
   }
   private Card deck[] = new Card[53];
   private int top;
   
}

