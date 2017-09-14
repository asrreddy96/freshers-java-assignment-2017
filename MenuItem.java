package Service;
import java.util.*;
import java.io.*;

public class MenuItem extends Thread
{
	public void menuItem()
	{
		try{
			Thread.sleep(1500);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
			try{
					FileInputStream fstream = new FileInputStream("C:/santhosh/eclipse/Gateway/src/main/java/Service/menu.txt");
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
				     Manager.receiveOrder();
			    }
		}


	



