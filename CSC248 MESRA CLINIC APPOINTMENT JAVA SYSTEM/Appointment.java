public class Appointment
{
   private String date;
   private String name;
   private int age;
   private String phone;
   private String ic;
   private String disease; // eg: Fever, Migraine, Gastric, Others
   public int waitingNo;
   private String nextApp;
   
   public Appointment(String a, String b, int c,String t, String d, String e, int f, String g)
   {
      date=a;
      name=b;
      age=c;
      phone=t;
      ic=d;
      disease=e;
      waitingNo=f;
      nextApp=g;
   }
   
   public void setAppointment(String a, String b, int c,String t, String d, String e, int f, String g)
   {
      date=a;
      name=b;
      age=c;
      phone=t;
      ic=d;
      disease=e;
      waitingNo=f;
      nextApp=g;
   }

   String getDate()
   {  return date; }
   
   String getName()
   {   return name; }
   
   int getAge()
   {  return age; }
   
    String getPhone()
   {return phone;}

   
   String getIc()
   {   return ic; }
   
     
   String getDisease()
   {  return disease; }
   
   int getWaitingNo()
   {  return waitingNo; }
   
   String getNextApp()
   { return nextApp;}
   
   public String toString()
   {  return ("\nDate: "+date+"\nName: "+name+"\nAge: "+age+"\nIC: "+ic+"\nPhone: "+phone+"\nType of Disease: "+disease+"\n"+"Waiting No.: "+waitingNo+"\n"+"Next Apppointment : "+nextApp );}
   
}