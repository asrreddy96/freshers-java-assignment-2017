package Service;
import java.util.*;
import java.io.*;
 public class Manager extends Thread
 {
	 static int i;
	 
	 public void showMenu()
		{
		MenuItem menu=new MenuItem();              //calling MenuItem class to display menu
		menu.menuItem();
		}
	             
		public static void allotTable()
		{
			try{
				Thread.sleep(500);
			ArrayList<Integer> tables=new ArrayList<Integer>();
			tables.add(1);
			tables.add(2);
			tables.add(3);
			tables.add(4);
			tables.add(5);
			tables.add(6);
			tables.add(7);
			tables.add(8);
			tables.add(9);
			tables.add(10);
			if(tables.size()==0)
			{
				Thread.sleep(1000);
				System.out.println(" Manager::tables or not free please wait for some time\n");       //manager checking tables to allot
			}
			
			else
			{    Thread.sleep(1000);
			      i=tables.get(0);
				  System.out.println("Manager::please be seated on Table"+tables.get(0)+"\n");
			      tables.remove(0);
			}
		
			  BusBoy busBoy=new BusBoy();                       //manager calls bus boy to serve water
			  busBoy.serveWater(tables.get(0));
	        
		   }  
			catch(Exception e)
			{
			e.printStackTrace();
		    }
		}
		  public static void receiveOrder()
		  {
	       try
	       {
	    	   Thread.sleep(1000);
	       }
	       catch(Exception e)
	       {
	    	   e.printStackTrace();
	       }
	       Order.receiveOrder();
		
		}
		 public static void handOutBill(int total)
	    {
			
			 try{
			    	 FileWriter fw=new FileWriter("cashregister.txt");    
			   	     PrintWriter pw=new PrintWriter(fw);
			   	     pw.println("Table\t\t   Bill");                       //writing the bill into cash register
			   	     pw.println("Table.no:"+i+"\t\t"+total);	     
			   	     System.out.println("Manager::Bill is handed over\n");
	    	         Customer.payBill();                        //calling customer to pay the bill
	    	         pw.close();
			 }
			 catch(Exception e)
			 {
				 e.printStackTrace();
			 }
			 }
	    }


