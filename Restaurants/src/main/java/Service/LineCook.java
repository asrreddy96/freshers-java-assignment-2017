package Service;

import java.util.*;

public class LineCook extends  Thread
{
	 public void cookFood(HashMap<String,Integer> items)
   {
		 try
		 {
		 Set set= items.entrySet();
         Iterator iterator = set.iterator();

      while(iterator.hasNext())
      {
    	  Thread.sleep(1200);
         Map.Entry<String,Integer> mentry = (Map.Entry)iterator.next();
         System.out.println("Linecook::"+mentry.getKey() + "order is ready to serve\n");      //informs server that food is ready to serve
   	     
       }
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
         Server server=new Server();                  //caling server to serve food   
		  server.serveFood(items);                    
      

   }
}



