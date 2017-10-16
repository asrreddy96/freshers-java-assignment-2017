package Service;
import java.util.*;

public class Order 
{
	     static HashMap<String,Integer> lstItem=new HashMap<String,Integer>();
		 static ArrayList<String> al=new ArrayList<String>();
		 static int[] ina=new int[32];
		 static int total=0;
		
		 public static void receiveOrder()
		{
		Scanner sc=new Scanner(System.in);
		List<Integer> l2=new ArrayList<Integer>();
		List<String> l1=new ArrayList<String>();
		l1.add("Veg_Manchow_Soup         "); l2.add(120);
		l1.add("Sweet_Corn_Vegetable_Soup"); l2.add(120);
	    l1.add("Veg_Hot&Sour_Soup        "); l2.add(110);
		l1.add("Baby_Corn_Manchurian     "); l2.add(100);
		l1.add("Veg_Manchurian           "); l2.add(90);
		l1.add("Gobi_Manchurian          "); l2.add(90);
		l1.add("Paneer_65                "); l2.add(150);
		l1.add("Veg_Spring_Roll          "); l2.add(150);
	    l1.add("Veg_Noodles              "); l2.add(120);
	    l1.add("Dal_Fry                  "); l2.add(150);
	    l1.add("Dal_Makhani              "); l2.add(150);
		l1.add("Kadai_Veg                "); l2.add(200);
	    l1.add("Kadai_Paneer             "); l2.add(200);
		l1.add("Malai_Kofta              "); l2.add(210);
		l1.add("Paneer_Butter_Masala     "); l2.add(250);
		l1.add("Palak_Paneer             "); l2.add(220);
		l1.add("Tandoori                 "); l2.add(50);
		l1.add("Rumal                    "); l2.add(50);
		l1.add("Butter                   "); l2.add(60);
		l1.add("Veg_Biryani              "); l2.add(160);
		l1.add ("Tomato_Biryani          "); l2.add(160);
		l1.add("Aloo_Biryani             "); l2.add(180);
		l1.add("Paneer_Biryani           "); l2.add(200);
		l1.add("Gobi_Biryani             "); l2.add(180);
	    l1.add("Butter_Naan              "); l2.add(80);
	    l1.add( "Plain_Naan              "); l2.add(70);
	    l1.add("Double_Ka_Meetha         "); l2.add(100);
		l1.add("Qubani_Ka_Meetha         "); l2.add(150);
		l1.add("Gajar_Ka_Halwa           "); l2.add(120);
		l1.add("Gulab_Jamun              "); l2.add(100);
		l1.add("Coke                     "); l2.add(80);
		l1.add("Thumsup                  "); l2.add(80);
		       int j=1;int i=-1;
			   while(j>0)
				{
				   i++;
				     System.out.println("Please enter the id");            //asking customer to enter the item id
	                             int id=sc.nextInt();
				     System.out.println("Enter the quantity");              //asking to enter the quantity of corresponding item
				                 int qty=sc.nextInt();
			      
			   if((id>0)&&(id<33)&&(qty!=0))                   //checking whwther item id and quantity are valid not
				{
			    	       lstItem.put(l1.get(id-1),qty);
					 
			    	 if((1<=id)&&(id<=9))
				{       System.out.print("Starters\t");
						System.out.println("  "+l1.get(id-1)+"\t"+qty);
						
						al.add("Starters "+"\t"+l1.get(id-1)+"\t"+qty+"\t"+(qty*l2.get(id-1)));
						ina[i]=qty*l2.get(id-1);
				}
	               else if((10<=id)&&(id<=16))
				{
					    System.out.print("Curries\t");
						System.out.println("  "+l1.get(id-1)+"\t"+qty);
						
	                    al.add("Curries "+"\t"+l1.get(id-1)+"\t"+qty+"\t"+(qty*l2.get(id-1)));
						ina[i]=qty*l2.get(id-1);
				}
				   else if((17<=id)&&(id<=19))
				{
					    System.out.print("Rotis\t");
						System.out.println("  "+l1.get(id-1)+"\t"+qty);
						
						al.add("Rotis   "+"\t"+l1.get(id-1)+"\t"+qty+"\t"+(qty*l2.get(id-1)));
						ina[i]=qty*l2.get(id-1);

	            }
				else if((20<=id)&&(id<=24))
				{
					    System.out.print("Biryanis\t");
						System.out.println("  "+l1.get(id-1)+"\t"+qty);
						
						al.add("Biryanis "+"\t"+l1.get(id-1)+"\t"+qty+"\t"+(qty*l2.get(id-1)));
						ina[i]=qty*l2.get(id-1);
				}
		         else if((25<=id)&&(id<=26))
				{
					     System.out.print("Naans\t");
						 System.out.println("  "+l1.get(id-1)+"\t"+qty);
						 
	                     al.add("Naans    "+"\t"+l1.get(id-1)+"\t"+qty+"\t"+(qty*l2.get(id-1)));
						 ina[i]=qty*l2.get(id-1);
						 }
				else if((27<=id)&&(id<=30))
				{
					    System.out.print("Desserts\t");
						System.out.println("  "+l1.get(id-1)+"\t"+qty);
						
						al.add("Desserts "+"\t"+l1.get(id-1)+"\t"+qty+"\t"+(qty*l2.get(id-1)));
						ina[i]=qty*l2.get(id-1);
				}
				else if((31<=id)&&(id<=32))
				{
					    System.out.print("Beverages\t");
						System.out.println("  "+l1.get(id-1)+"\t"+qty);
						
						al.add("Beverages"+"\t"+l1.get(id-1)+"\t"+qty+"\t"+(qty*l2.get(id-1)));
						ina[i]=qty*l2.get(id-1);
				}
				else
				{
					System.out.println("wrong selection please enter correct value");
			   	}
				}
			       else
					{
			    	   System.out.println("please enter valid quantity");
					}
		           System.out.println("do u want anything else\n");            //enter yes if u want any thing else otherwise enter no
				   System.out.println("enter yes or no\n"); 
				   String n=sc.next();
				   String s1="yes";
				   String s2="no";
				   if(n.equals(s1))
					{
					    j=1;
					   }
				   else if(n.equals(s2))
					{
					   j=0;
					}
					else
						System.out.println("Invalid selection");		
			}
			   ExecutiveChef exeChef=new ExecutiveChef();
			   exeChef.orderToBeCooked(lstItem);
				bill(al,ina);
				sc.close();
			}

		public static  void bill(ArrayList a,int[] b)
		{
			for(Object o:a)
			{
				System.out.println(o);                   //printing the itemname quantity and price on the console 
				System.out.println("\n");
		    }
			for(int i:b)
			{
				total=total+i;
		    }
		  System.out.println("-------------------------------------------------------------------------------");
	      System.out.println("\t\t\t\t\t\t total: "+total);         //printing the total bill on the console
	      Manager.handOutBill(total);
	}
	}
		 
		 
		 

		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

			
			
			
			
			
			


