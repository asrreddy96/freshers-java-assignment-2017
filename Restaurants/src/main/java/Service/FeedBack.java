package Service;
import java.io.*;
import java.util.*;

public class FeedBack {
		public static void receiveFeedBack()
	    {
	    	System.out.println("-----------Feedback-----------");
	    	
	    	System.out.println("Manager::enter customer name");
	    
	    	Scanner s=new Scanner(System.in);                  //reads customer name
	    	String name=s.next();
	    	
	    	System.out.println("please give the feed back\n" );  //reads corresponding customer's feedback
	    	String feedBack=s.next();
	    	
	    	try
	    	{
	    	
	    	   FileWriter fw=new FileWriter("feedback.txt");    
	   	       PrintWriter pw=new PrintWriter(fw);
	   	       
	   	       pw.println(name+"  ::\t\t"+feedBack);          //stores customer name and their feedback into feedback.txt
	   	       pw.close();
	   	     
	   	       System.out.println("\nManager::Thank you ");
	   	       BusBoy bb=new BusBoy();             //calling busboy to clean table
	   	       s.close();              //closing Scanner resource  
	    	} 
	    	catch(Exception e)
	    	{
	         e.printStackTrace();
	          
	    	}     

		}
	}



