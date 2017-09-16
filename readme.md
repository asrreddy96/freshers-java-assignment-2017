Project Description :
     The project is about restaurant Management System which starts with customer entrance into the Restaurant asks the watchman for valet parking then after host waecomes the customer ,manager allots the table busboys clean the table and Manager shows the menu to the customer and  receive the orderthen keeps oreder into order register and ask executive chef to prepare the order he gets order from manager and orders linecook to prepare order after preparation line cook informs server that food is ready to serve then server serves the food on respective table ,customer will have his food and ask the manager to generate the bill customer generates bill manager generates the bill and stores the bill information in cash register and gives the bill to customer, customer will pay the bill and gives feedback and leaves the resaturant.
  
Project Architecture:
      In the project main method is present in Restaurant class in the Restaurant.java from there methods from various classes will be called ,for showing the menu i have used files concept Buffered reader is uesd to read the menu from file menu.txt and prints on to the console,after taking order the order details will be stored in the order.txt and the bill details will be stored in cashregister.txt and there is a separate class for each of the staff members like manager,server,busboy and etc., there are separate classes for customer,menu items,order and feed back.

How to run the project?
      The project is built by using maven  and a .jar file is generated for that ,to run this jar file you should go for the project directory through command prompt and execute jar file by using  the folowing command
       
            "java -jar RestaurantManagementProject.jar"

Note:     the generated .jar file and the four .txt files must be in the same folder to run the  .jar file successfully

In the project folder there are following files
1.     .java files are present in src/main/java/Service path in the project

2.    .class files are present in the target folder in the project

3.     .txt files

4.      RestaurantManagementProject.jar

5.      pom.xml  file
 
 open project directory in command prompt and type  " java -jar RestaurantManagementProject.jar" then the project will run

 give the required inputs on the console for selecting menu and quantity .

