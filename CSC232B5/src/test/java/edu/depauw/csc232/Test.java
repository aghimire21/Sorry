package edu.depauw.csc232;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;
public class Test {

   @org.junit.Test
   public void testCreateAShuffledDeck() {
      // This method is a jUnit test designed to identify if the shuffle deck method is 
      // Working properly.
      Deck testDeck = new Deck();
      testDeck.shuffle();

         assertTrue(testDeck.drawCard().getNum()!=1);
   }
   
}
