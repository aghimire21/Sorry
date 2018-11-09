package edu.depauw.csc232;

public class Card {
   // This class designs and implements the rules of all the
   // cards used in the game. Some cards have special characteristics 
   // and will have special rules and methods because of that.
   

   public Card(int num, String rule) {
      super();
      this.num = num;
      this.rule = rule;
   }
   
   public int getNum() {
      // Almost every card has a number (1-12) corresponding to it.
      // This method allows us to retrieve that number for further board actions.
      return num;
   }
  

   public String getRule() {
      // If a card has a special rule of some sorts, it will be identified and returned 
      // using this method for further board actions.
      return rule;
   }

   public void setNum(int num) {
      // This method is used when building the deck so we can assign numbers to cards.
      this.num = num;
   }

   public void setRule(String rule) {
      // This methods is used when building the deck so we can assign specific rules to cards.
      this.rule = rule;
   }


   private String rule;
   private int num;
}
