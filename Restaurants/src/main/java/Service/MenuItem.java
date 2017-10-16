package Service;
import java.util.*;
import java.io.*;

public class MenuItem extends Thread
{
	public void menuItem()
	{
			try{
				        
					FileInputStream fstream = new FileInputStream("menu.txt");
					BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
					
					Thread.sleep(1500);
					
					String strLine;
					System.out.println ("              ------------MENU------------             ");  
					
					while ((strLine = br.readLine()) != null)  //Read the file line By line
					{
					 
					  System.out.println (strLine); // Print the content on the console
					}

					//Close the input stream

					br.close();   //Close the input stream
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
					
				}
				     Manager.receiveOrder();
			    }
		}


	



