public class TreeNode
{
    TreeNode left;
    TreeNode right;
    Appointment data;

    public TreeNode(Appointment d)
    {
	     data = d;
        left=right=null;
    }

   public void insert(Appointment d )
   {
      if ( d.getWaitingNo() < data.getWaitingNo() )
      {
         if ( left == null )
            left = new TreeNode( d );
         else
            left.insert( d );
      }
      else 
        if ( d.getWaitingNo() > data.getWaitingNo() ) 
        {
           if ( right == null )
               right = new TreeNode( d );
           else
               right.insert( d );
        }
    }
}