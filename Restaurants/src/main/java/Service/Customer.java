package Service;
public class Customer extends Thread
{
		public void customerEntrance()        //customer enters into restaurant
		{    
			System.out.println("customer Entering into Restaurant\n");
			try
			{
			Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			    System.out.println("Customer::watchman park my car\n");         //asks watchman for vallet parking
			    Security s=new Security();
			    s.parkCar();
		}
	    public static void showMenu()
		{
			    System.out.println("Customer::Please show the Menu\n");      
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			Manager manager=new Manager();       //asking the manager to show menu
			manager.showMenu();
			Manager.receiveOrder();              //asking manager to receive order
		}
	    public static void payBill()
	    {
	    	System.out.println("paid the Bill\n");                //paid the bill
	    	FeedBack.receiveFeedBack();
	    }

	}

