import java.io.*;
import java.util.*;
class Customer
{
	public void customerEntrance()
	{
		System.out.println("Customer::park my car");
		Security s=new Security();
		s.parkCar();
	}
    public static showMenu()
	{
		System.out.println("Customer::Please show the Menu");
		Manager manager=new Manager();
		manager.showMenu();
		manager.receiveOrder();
	}

}