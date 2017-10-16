package Service;

public class BusBoy 
{
           BusBoy()
			{
			System.out.println("\nBusBoy::Table is cleaned");                       //will be executed whenever BusBoy object is created
		    } 
		
           public void serveWater(int i)
		{  
			System.out.println("Fresh clothes are laid and Water is Served on Table.No:"+(i-1));
			Manager man=new Manager();
			man.showMenu();
		}
	}



