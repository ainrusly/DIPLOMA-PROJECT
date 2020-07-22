import java.util.*;
import java.io.*;
import javax.swing.*;

public class AppointmentInfo
{
  public static void main(String[] args)
  {
    Scanner scan=new Scanner(System.in);
	 BSTAppointment info=new BSTAppointment();
    Queue waitingNo= new Queue();
	 Queue tempQ=new Queue();
	 Stack AppDate = new Stack();
    Stack newApp = new Stack();
	 LinkedList nextAppLL = new LinkedList();
	 ArrayList PatientAL = new ArrayList();
    ArrayList FeverAL= new ArrayList();
    ArrayList MigraineAL= new ArrayList();
    ArrayList GastricAL= new ArrayList();
	 int count1=0,count2=0,count3=0, count4=0, count5=0,count6=0,count7=0,count8=0,count9=0,count10=0 , count11=0, count12=0; 
	 int ans1=1;
	 
	 
	 while(ans1==1)
	 {
	   System.out.println("\n\n\n******************************** WELCOME TO CLINIC MESRA ******************************");
		                                                    
	 	System.out.println("\n\t\t\t1.APPOINTMENT FORM         2.RECEIPT\n\t\t\t3.WAITING NO               4.ANNUAL REPORT\n\t\t\t5.NEXT APPOINTMENT         6.DELETE OLD RECORD ");
		System.out.println("\nCHOOSE:");
	 	int ans=scan.nextInt();
	 
	 	if(ans==1)
	 	{
	    System.out.println("\n\n\t\t\t\t  APPOINTMENT FORM");
		 System.out.println("\t\t\t\t  ================");
		 System.out.print("\n\t\t\t\t  DATE: ");
		 String date=scan.next();
		 System.out.print("\t\t\t\t  NAME: ");
		 String name=scan.next();
		 System.out.print("\t\t\t\t  AGE: ");
		 int age=scan.nextInt();
		 System.out.print("\t\t\t\t  PHONE NUMBER: ");
		 String phoneNo=scan.next();
		 System.out.print("\t\t\t\t  IC: ");
		 String ic=scan.next();
		 System.out.print("\t\t\t\t  DISEASE: ");
		 String disease=scan.next();
		 System.out.print("\t\t\t\t  NEXT APPOINTMENT: ");
		 String nextApp=scan.next();
		 
		 while (!waitingNo.isEmpty())//QUEUE
		 {
		    Appointment p=(Appointment) waitingNo.dequeue();
			
		    System.out.print("current waiting No:");
			 System.out.print(p.getWaitingNo()+"\n");
			 
			 tempQ.enqueue(p);//temp
		 }
		 if (tempQ.isEmpty())
		 {
		   System.out.println("No waiting number yet");
		 }
			System.out.print("Waiting no:");
			int waitingno=scan.nextInt();
		 
		 Appointment x= new Appointment (date,name,age,phoneNo,ic,disease,waitingno,nextApp);
		 waitingNo.enqueue(x);//QUEUE
		 info.insertNode(x);//BINARY TREE
		 AppDate.push(x);//STACK
		 nextAppLL.insertAtFront(x);//LINKED LIST
		 PatientAL.add(x);//ARRAY LIST
		 
		  while (!AppDate.isEmpty())
            {
		         Appointment n=(Appointment)AppDate.pop();

               if ((n.getDate()).substring(6,10).equalsIgnoreCase("2018"))
               newApp.push(n);
            }

		}
		if(ans==2)//BINARY TREE
		{
		   System.out.print("\n\n");
			info.calcPayment();
		}
		
		else if(ans==3)//QUEUE
		{

			while (!tempQ.isEmpty())
		 { 
			 waitingNo.enqueue(tempQ.dequeue());
		 }

		while (!waitingNo.isEmpty())
		 { 
		    System.out.print("\n\n");
		    Appointment b=(Appointment) waitingNo.dequeue(); 
		    System.out.println("-------------------------\n\n NAME:"+b.getName()+"\n WAITING NO :"+ b.getWaitingNo()+"\n\n-------------------------");   
		 } 

		
		}
		else if(ans==4)
		{
		
			while(!newApp.isEmpty())
         { 
          	System.out.print(newApp.pop() +"\n");
         }
				
			for(int i=0 ; i<PatientAL.size(); i++)
  			{
  				Appointment m = (Appointment) PatientAL.get(i);
  
   			if(m.getDisease().equalsIgnoreCase("Fever"))
    			{
       			FeverAL.add(m);
     			}
   			else if (m.getDisease().equalsIgnoreCase("Migraine"))
   			{
    				MigraineAL.add(m);
   			}
   			else if (m.getDisease().equalsIgnoreCase("Gastric"))
   			{
   				GastricAL.add(m);
   			}
  			}
			
			System.out.println( "\nNumber of Patient(s) that Infected With Migraine Disease : " + MigraineAL.size());
   		System.out.println();
   		System.out.println( "\nNumber of Patient(s) that Infected With Gastric Disease : " + GastricAL.size());
  	 		System.out.println();
   		System.out.println( "\nNumber of Patient(s) that Infected With Cold Fever Disease : " + FeverAL.size());
   		System.out.println();
	
		}
		else if(ans==5)
		{
			Appointment m = (Appointment) nextAppLL.getFirst();
    		System.out.println("\n           LIST OF NEXT APPOINTMENT      ");
    		System.out.println("-------------------------------------------");
  			int count=1;
   		while(m!=null)
   		{    
     			System.out.println((count++ +")")+ " " + m.getName()+ " " + m.getIc()+ " " + m.getPhone()+ " " +m.getDate());
     				if(m.getNextApp().substring(3,5).equals("01"))
     				{
       				count1++;
     				}
     				else if(m.getNextApp().substring(3,5).equals("02"))
     				{
       				count2++;
     				}
     				else if(m.getNextApp().substring(3,5).equals("03"))
     				{
       				count3++;
     				}
    				else if(m.getNextApp().substring(3,5).equals("04"))
     				{
       				count4++;
     				}
   				else if(m.getNextApp().substring(3,5).equals("05"))
     				{
       				count5++;
     				}
   				else if(m.getNextApp().substring(3,5).equals("06"))
     				{
       				count6++;
     				}
   				else if(m.getNextApp().substring(3,5).equals("07"))
     				{
       				count7++;
     				}
   				else if(m.getNextApp().substring(3,5).equals("08"))
     				{
       				count8++;
    			 	}
  					else if(m.getNextApp().substring(3,5).equals("09"))
     				{
       				count9++;
     				}
  					else if(m.getNextApp().substring(3,5).equals("10"))
     				{
       				count10++;
     				}
  					else if(m.getNextApp().substring(3,5).equals("11"))
     				{
       				count11++;
     				}
 					else if(m.getNextApp().substring(3,5).equals("12"))
     				{
       				count12++;
     				}

    			 m=(Appointment) nextAppLL.getNext();
     }
     System.out.println( "\n Total Next Appointment For JAN: "+count1 );
     System.out.println( "\n Total Next Appointment For FEB: "+count2 ); 
     System.out.println( "\n Total Next Appointment For MAC: "+count3 );
     System.out.println( "\n Total Next Appointment For APR: "+count4 );
     System.out.println( "\n Total Next Appointment For MAY: "+count5 );
     System.out.println( "\n Total Next Appointment For JUN: "+count6 );
     System.out.println( "\n Total Next Appointment For JUL: "+count7 );
     System.out.println( "\n Total Next Appointment For AUG: "+count8 );
     System.out.println( "\n Total Next Appointment For SEP: "+count9 );
     System.out.println( "\n Total Next Appointment For OCT: "+count10 );
     System.out.println( "\n Total Next Appointment For NOV: "+count11 );
     System.out.println( "\n Total Next Appointment For DEC: "+count12 );
   
		
		} 
      else if (ans==6)
      {
      for(int i=0 ; i<PatientAL.size(); i++)
       {
        Appointment z = (Appointment) PatientAL.get(i);
  
          if(z.getDate().substring(6,10).equals("2017"))
           {
            PatientAL.remove(i);
            i--;
           }
        }
            System.out.println("The Data Has been Deleted");

               
      }
           


		System.out.print("\n\n");
		System.out.println("DO YOU WANT TO CONTINUE TO MENU: 1.YES 2.NO");
		ans1=scan.nextInt();
	}
		
			}
}
	                                                                                          
		 
		 
	 