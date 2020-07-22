import java.util.*;

public class patientInfo
{
 public static void main (String [] args)
 {
 /* ArrayList PatientAL = new ArrayList();
  ArrayList FeverAL= new ArrayList();
  ArrayList MigraineAL= new ArrayList();
  ArrayList GastricAL= new ArrayList();*/
  
  
   String a,b,d,e,g,t;
  int c,f;
  Scanner scan= new Scanner (System.in);
  
  for ( int i=0; i<2 ; i++)
  {
  System.out.print("Enter Date : ");
  a=scan.next();
  System.out.print("Enter Patient Name : ");
  b=scan.next();
  scan.nextLine();
  System.out.print("Enter Patient Age : ");
  c=scan.nextInt();
  System.out.print("Enter Patient Phone : ");
  t=scan.next();

  System.out.print("Enter Patient IC : ");
  d=scan.next();
  System.out.print("Enter Patient Disease : ");
  e=scan.next();
  scan.nextLine();
  System.out.print("Enter Waiting Number : ");
  f=scan.nextInt();
  System.out.print("Enter Next Appoinment :");
  g=scan.next();
  Appointment x = new Appointment (a,b,c,t,d,e,f,g);
 //PatientAL.add(x);
  }
  
  /*for(int i=0 ; i<PatientAL.size(); i++)
  {
  Appointment m = (Appointment) PatientAL.get(i);
  
   if(m.getDisease().equalsIgnoreCase("Fever"))
     {
       FeverAL.add(m);
     }
   else
   if (m.getDisease().equalsIgnoreCase("Migraine"))
   {
    MigraineAL.add(m);
   }
   else 
   if (m.getDisease().equalsIgnoreCase("Gastric"))
   {
   GastricAL.add(m);
   }
  }
  
 for(int i =0 ; i<PatientAL.size();i++)
  {
  Appointment j = (Appointment)PatientAL.get(i);
  System.out.println("\n---------------------------------------------DATE : "+j.getDate());
  System.out.println("-----------------------CLINIC TODAK-------------------------------");
  System.out.println("\nPATIENT NUMBER  : "+" "+(i+1));
  System.out.println("------------------------------------------------------------------");
  System.out.println("                                                                 |");
  System.out.println("\nPATIENT NAME : "+" "+j.getName());
  System.out.println("                                                                 |");
  System.out.println("\nPATIENT AGE  : "+" "+j.getAge());
  System.out.println("                                                                 |");
  System.out.println("\nPATIENT IC : "+" "+j.getIc());
  System.out.println("                                                                 |");
  System.out.println("\nPATIENT DISEASE : "+" "+j.getDisease());
  System.out.println("                                                                 |");
  System.out.println("\nNEXT APPOINTMENT : "+" "+j.getNextApp());
  System.out.println("                                                                 |");
  }
   System.out.println( "\nNumber of Patient(s) that Infected With Migraine Disease : " + MigraineAL.size());
   System.out.println("                                                                 |");
   System.out.println( "\nNumber of Patient(s) that Infected With Gastric Disease : " + GastricAL.size());
   System.out.println("                                                                 |");
   System.out.println( "\nNumber of Patient(s) that Infected With Cold Fever Disease : " + FeverAL.size());
   System.out.println("                                                                 |");
  System.out.println("------------------------------------------------------------------");


}*/}
