package edu.depauw.csc232;

public class Canvas {
   public Canvas()
   {
     
      for(int i= 0; i< line.length; i++)
      {
         line[i]=false;
      }
   }
   
   public void start(int playernum)
   {
      if (playernum == 1)
      {
         line[1]=true;
      } 
      else if (playernum == 2)
         
      {
         line[2]=true;
      }
      else if (playernum==3)
      {
        line[3]=true;
      }
      else if(playernum == 4)
      {
         line[4]=true;
      }
   }
   
   public void move(int movement, int pawnRecord )
   {
      line[pawnRecord]=false;
      line[pawnRecord+movement]=true;
   }
   
   public boolean isfilled(int position)
   {
      return line[position];
   }
   
   
   
   private boolean[] line = new boolean[1000]; 
   
   

}
