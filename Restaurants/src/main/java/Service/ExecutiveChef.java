package Service;
import java.util.*;
import java.io.*;

public class ExecutiveChef 
{
	 public void orderToBeCooked(HashMap<String,Integer> items)
	    {     
		 try
	     {          
			    	 FileWriter fw=new FileWriter("order.txt");
			   	     PrintWriter pw=new PrintWriter(fw);
			   	     
	    	         Set set= items.entrySet();
	                 Iterator iterator = set.iterator();            
	                 
	                 int i=1;
	        
	        while(iterator.hasNext())
	        {
	       	         Map.Entry<String,Integer> mentry = (Map.Entry)iterator.next();   //reading contents of map using iterator
	       	  
	                 System.out.println("\n Exe.Chef::"+mentry.getKey()+" order preparing by Line cook"+i);
	                 pw.println(mentry.getKey()+"\t"+mentry.getValue());
	                 i=i+1;
	        }
	                 pw.close();
	     }
		 catch(Exception e)
		    {
	    	         e.printStackTrace();
		    }
	        
	                 LineCook lineCook=new LineCook();
			         lineCook.cookFood(items);
	    } 
	}


