public class BSTAppointment
{  
   private TreeNode root;
	
	public BSTAppointment()
	{ root=null; }
	
	public void insertNode(Appointment d)
	{
	  if(root==null)
	    root=new TreeNode(d);
	  else 
	    root.insert(d);
	}
	public void calcPayment()
	{
  		calcPaymentDetail(root);
	}

	private void calcPaymentDetail(TreeNode node)
	{
  		double charge=0.00;
  			if(node==null)
   		 	System.out.println();
 			else 
  			{
   			Appointment x=(Appointment)node.data;
				
	 			if(x.getDisease().equalsIgnoreCase("Fever"))
	     				charge=10.00;
				else if(x.getDisease().equalsIgnoreCase("Migraine"))
		  				charge=10.00;
				else if(x.getDisease().equalsIgnoreCase("Gastric"))
		  				charge=5.00;
				else if(x.getDisease().equalsIgnoreCase("Others"))
		  				charge=15.00;
				else
				      charge=15.00;
	  
	  				System.out.println("----------PAYMENT----------\n");
					System.out.println("NAME: "+x.getName());
					System.out.println("AGE: "+x.getAge());
					System.out.println("IC: "+x.getIc());
					System.out.println("DISEASE: "+x.getDisease());
	  				if(x.getAge()>=50)
	  				{
	    				System.out.println("CHARGE(30% off): RM"+(charge-(charge*0.3)));
	  				}
	  				else
	 				{ 
	   				System.out.println("CHARGE: RM"+charge);
	  				}
	  
					System.out.println("\n---------------------------");
					calcPaymentDetail(node.left);
					calcPaymentDetail(node.right);
	}
}
}