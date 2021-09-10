package exceptinhandling;

public class ExceptionHanldingDemo1
{

	public static void main(String[] args)
	{

      try 
      {
    	  String s1 =null;
    	  System.out.println(s1.length()); 			  
      }
      //If we dont know the exception that try block might throw then we can use
      //Exception class object with catch block like (Exception e)
      catch(NullPointerException e)
     {
   	    System.out.println(e.getMessage());
     }
      
      finally
     {
    	  System.out.println("This is finally block");
      }
	
   }
}
