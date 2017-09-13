import java.io.*;
import java.util.*;

class Menu1 
{       
	    {
	try{
			FileInputStream fstream = new FileInputStream("c:/santhosh/final/menu.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
             String strLine=br.readLine();
	    	 System.out.println ("      ------------MENU------------      ");
			while(strLine!=null)
		{
				 String[] arr=strLine.split("-");
			     System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
				 strLine=br.readLine();
				
	    }
			br.close();
			}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
	}	    

}