package edu.depauw.csc232;

public class Driver( int numPlayers) 
{
     public static void main(String[] args) {
     Deck deck1 = new Deck();
     
     deck1.buildDeck();
     
     for(int i=0 ; i<52 ; i++) {
         System.out.println(deck1.drawCard().getNum()); 
      }
      
      deck1.shuffle();
      for(int i=0 ; i<52 ; i++) {
         System.out.println(deck1.drawCard().getNum()); 
      }
   }
}

