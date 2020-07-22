import java.util.*;
public class nextAppInfo
{
 public static void main (String [] args)
 {
  LinkedList nextAppLL = new LinkedList();
  String a,b,d,e,g,t;
  int c,f;
  //int count1=0,count2=0,count3=0, count4=0, count5=0,count6=0,count7=0,count8=0,count9=0,count10=0 , count11=0, count12=0;
  Scanner scan = new Scanner(System.in);
  for( int i = 0 ; i < 2; i++)
  {
  System.out.print("Enter Date : ");
  a=scan.next();
  System.out.print("Enter Patient Name : ");
  b=scan.next();
  System.out.print("Enter Patient Age : ");
  c=scan.nextInt();
  System.out.print("Enter Patient Phone : ");
  t=scan.next();
  System.out.print("Enter Patient IC : ");
  d=scan.next();
  System.out.print("Enter Patient Disease : ");
  e=scan.next();
  System.out.print("Enter Waiting Number : ");
  f=scan.nextInt();
  System.out.print("Enter Next Appoinment :");
  g=scan.next();
  
  Appointment app = new Appointment (a,b,c,t,d,e,f,g);
  nextAppLL.insertAtFront(app);

  }
  
    /*Appointment m = (Appointment) nextAppLL.getFirst();
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
   
   }*/}
