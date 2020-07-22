import java.util.*;
import java.io.*;
import javax.swing.*;

public class AppointmentAin
{
  public static void main(String[] args)
  {
    Scanner scan=new Scanner(System.in);
	 //BSTAppointment info=new BSTAppointment();
    Queue waitingNo= new Queue();
    LinkedList patientRecord = new LinkedList ();
    Stack AppDate = new Stack();
    Stack newApp = new Stack(); 
  	 int ans1=1;
	 
	 
	 while(ans1==1)
	 {
	   System.out.println("WELCOME");
	 	System.out.println("1. Appointment Form  2.Annual Appointment");
	 	int ans=scan.nextInt();
	 
	 	   if(ans==1)
	 	   {
	         System.out.println("APPOINTMENT FORM");
		      System.out.print("date: ");
		      String date=scan.next();
		      System.out.print("name: ");
		      String name=scan.next();
		      System.out.print("age: ");
		      int age=scan.nextInt();
		      System.out.print("ic: ");
		      String ic=scan.next();
		      System.out.print("disease: ");
		      String disease=scan.next();
		 
            Appointment x= new Appointment (date,name,age,ic,disease);
       
		      while (!waitingNo.isEmpty())
		      {
		  	      queueNo a=(queueNo) waitingNo.dequeue();
		         //masuk dalam temp
		         System.out.print("current waiting No:");
			      System.out.print(a.getWaitingNo());
		      }
		      
            System.out.println("No waiting number yet");
			
			   System.out.print("Waiting no:");
			   int waitingno=scan.nextInt();
		  	   queueNo z= new queueNo(waitingno);
		  	   waitingNo.enqueue(z);
            //AppDate.push(x);
         
            while (!AppDate.isEmpty())
            {
		         Appointment n=(Appointment)AppDate.pop();

               if ((n.getDate()).substring(6,10).equalsIgnoreCase("2018"))
               newApp.push(n);
            }
               
      }
		
		if(ans==2)
		{ 
         while(!newApp.isEmpty())
         {
            System.out.print(newApp.pop() +"\n");
         }
      }//

		System.out.println("DO YOU WANT TO CONTINUE TO MENU: 1.YES 2.NO");
		ans1=scan.nextInt();
            
  }

		while (!waitingNo.isEmpty())
		 { 
			 queueNo b=(queueNo) waitingNo.dequeue(); 
		    System.out.println("-------------------------\n\n WAITING NO :"+ b.getWaitingNo()+"\n\n-------------------------");   
		 }

	}
}
	                                                                                          
		 
		 
	 