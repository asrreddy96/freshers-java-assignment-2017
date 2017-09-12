spackage Service;
import Model.*;
import java.io.*;
import java.util.*;

public class RestaurantService {
	
	public void customerEntrance()
	{
		System.out.println("Host::welocme to gateway.");
		RestaurantService rs=new RestaurantService();
		rs.tableAllotment();
	}
	public void tableAllotment()
	{
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
			System.out.println("Manager::tables are in use please wait for some time");
		else
			System.out.println("Manager::please be seated on Table"+tables.get(0));
		tables.remove(0);
		RestaurantService rs=new RestaurantService();
		rs.cleanTable();
	}
	public void cleanTable()
	{
		System.out.println("BusBoy::tables are cleaned \n           fresh cloths are laid\n          water is served");
		RestaurantService rs=new RestaurantService();
		rs.showMenu();
	}
	public void showMenu()
	{
		try{
			// Open the file
			FileInputStream fstream = new FileInputStream("src/main/java/menu.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

			String strLine;
			 System.out.println ("      ------------MENU------------      ");  
			//Read File Line By Line
			while ((strLine = br.readLine()) != null)   {
			  // Print the content on the console
			  System.out.println (strLine);
			}

			//Close the input stream
			br.close();

			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
		     RestaurantService rs=new RestaurantService();
		     rs.receiveOrder();
	    }
    public void receiveOrder()
    {
    	int i=1;
    	System.out.println("\t Order List ");
    	Scanner sc=new Scanner(System.in);
    	HashMap<String,Integer> lstItem=new HashMap<String,Integer>();
       
    	try
	     {
    		FileWriter fw=new FileWriter("src/main/java/order.txt");
	    	 PrintWriter pw=new PrintWriter(fw);
    	while(i>0)
    	{
    		      System.out.println("Manager::Enter Item Name");
    		      String name=sc.next();
    		      System.out.println("Manager::Enter Quantity");
    		      int qty=sc.nextInt();
    		      pw.println(name+"\t\t\t\t-\t\t\t\t"+qty+"-"); 	    	    	 
    	    	  lstItem.put(name, qty);
    		      System.out.println("Manager::Do you want anything else");
    		      System.out.println("enter yes or no");
    		      String result=sc.next();
    		      String s1="yes";
    		      String s2="no";
    	         if(s1.equals(result))
    			 {
    			  i=1;
    	         }
    		     else if(s2.equals(result))
    			 {
    			  i=0;
    			 }
    		    else 
    		     {
    			 System.out.println(" Invalid text");
    			 break;
    		     }
    	         }pw.flush();
	             }
    	        catch(Exception e)
	             {
	    	     e.printStackTrace();
	    	     }
    	         sc.close();
                 RestaurantService rs=new RestaurantService();
		         rs.orderToBeCooked(lstItem);
    }
    
    public void orderToBeCooked(HashMap<String,Integer> items)
    {
           Set set= items.entrySet();
           Iterator iterator = set.iterator();
           int i=1;
        while(iterator.hasNext())
        {
       	 
           Map.Entry mentry = (Map.Entry)iterator.next();
           System.out.println("Order :\t "+ mentry.getKey() + "  \tQuantity :"+mentry.getValue());
           System.out.println("Exe.Chef::"+mentry.getKey()+" order preparing by Line cook"+i);
           i=i+1;
        }
        
           RestaurantService rs=new RestaurantService();
		   rs.cookFood(items);
    } 
    
    public void cookFood(HashMap<String,Integer> items)
    {
    	System.out.println("Line Cook::Food is ready to Serve");
    	RestaurantService rs=new RestaurantService();
		  rs.serveFood(items);
    }
    public void serveFood(HashMap<String,Integer> items)
    {
    	System.out.println("Server::Food is Served");
    	System.out.println("customer::Prepare the bill");
    	 RestaurantService rs=new RestaurantService();
		 rs.billGeneration(items);
    }

    
    public void billGeneration(HashMap<String,Integer> items)
    {
    	int total=0;
    	try
    	{
    	FileInputStream fstream = new FileInputStream("src/main/java/menu.txt");
    	BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

    	String strLine= br.readLine();

    	//Read File Line By Line
    	while (strLine!= null)   
    	{
    		String[] arr=strLine.split("-");
    		    String s=arr[0];
    		    int a[][]=new int[][];
    		    	System.out.println(items.containsKey(s));
    		    
 
    	     /*  int var= items.get(arr[0].trim());
			    if(var!=0)
			    {
			    	System.out.println(var);
			    }*/
    		 
    		    strLine=br.readLine();
    		    
    	}
		br.close();
		
          
    	}
		catch(Exception e)
    	   {
			System.out.println(e.getMessage());
			
		   }
		RestaurantService rs=new RestaurantService();
		rs.handOutBill();
    	
    }
    public void handOutBill()
    {
    	System.out.println("Manager::Bill is handed over");
    	RestaurantService rs=new RestaurantService();
		rs.payBill();
    }
    public void payBill()
    {
    	System.out.println("Customer:paid the bill");
    }
    public void receiveComplaints()
    {
    	
    }   
   
    



































}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    