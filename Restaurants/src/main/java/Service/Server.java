package Service;
import java.util.*;

public class Server extends Thread
{
 public void serveFood(HashMap<String,Integer> items)
    {
    try
    {
    	Thread.sleep(1000);
        System.out.println("Server::Food is Served\n");                     //server telling that food is served
        Thread.sleep(1500);
    	System.out.println("customer::Prepare the bill");                      //customer asking manager to prepare bill 
    }catch(Exception e)
    {
    	e.printStackTrace();
    }
}

}
