package edu.depauw.csc232;

public class Rules {

   private int cardNumber;
   private int pawnNumber;
   private int[][] pawnRecord;
   private int pawnmove;
   private Canvas canvas;
   private int playernum;
   

   public Rules(int cardNumber, int pawnNumber, int[][] pawnRecord, int pawnmove, int playernum) 
   {
    this.cardNumber = cardNumber;  
    this.pawnNumber = pawnNumber;
    this.pawnRecord=pawnRecord;
    this.pawnmove =  pawnmove;
    this.playernum = playernum;
   }
   
   public void move()
   {   
      if (cardNumber==1)
      {
         canvas.move(cardNumber,pawnRecord[pawnmove][playernum]);
      }
      else if (cardNumber==2)
      {
         canvas.move(cardNumber,pawnRecord[pawnmove][playernum]);
      }
      else if (cardNumber==3)
      {
         canvas.move(cardNumber,pawnRecord[pawnmove][playernum]);
      }
      else if (cardNumber==4)
      {
         canvas.move(cardNumber,pawnRecord[pawnmove][playernum]);
      }
      else if (cardNumber==5)
      {
         canvas.move(cardNumber,pawnRecord[pawnmove][playernum]);
      }
      else if (cardNumber==6)
      {
         canvas.move(cardNumber,pawnRecord[pawnmove][playernum]);
      }
      else if (cardNumber==7)
      {
         canvas.move(cardNumber,pawnRecord[pawnmove][playernum]);
      }
      else if (cardNumber==8)
      {
         canvas.move(cardNumber,pawnRecord[pawnmove][playernum]);
      }
      else if (cardNumber==9)
      {
         canvas.move(cardNumber,pawnRecord[pawnmove][playernum]);
      }
      else if (cardNumber==10)
      {
         canvas.move(cardNumber,pawnRecord[pawnmove][playernum]);
      }
      else if (cardNumber==11)
      {
         canvas.move(cardNumber,pawnRecord[pawnmove][playernum]);
      }
      else if (cardNumber==12)
      {
         canvas.move(cardNumber,pawnRecord[pawnmove][playernum]);
      }
      
      
   }
   
}
