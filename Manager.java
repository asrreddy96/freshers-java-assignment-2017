import java.util.*;
import java.io.*;
 public class Manager extends Menu1
{
/*public void showMenu()
	{
	Menu1 menu=new Menu1();
	}
             
	public static void allotTable()
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
			System.out.println(" Manager::tables or not free please wait for some time");
		else
			System.out.println("Manager::please be seated on Table"+tables.get(0));
		tables.remove(0);
		BusBoy busBoy=new BusBoy();
		   busBoy.serveWater(tables.get(0));
}*/
                   
	  public static void receiveOrder()
	{
    	Order order=new Order();
		order.orderRegister();
	}
	 public void handOutBill()
    {
    	System.out.println("Manager::Bill is handed over");
    	RestaurantService rs=new RestaurantService();
		rs.payBill();
    }