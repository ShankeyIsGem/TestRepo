package exceptinhandling;

public class CheckedException
{

	public static void main(String[] args)
	{
		System.out.println("Program Started");
		System.out.println("Program is in progress");
		
		try {
	 
			Thread.sleep(4000);
		}
		
		catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
			
		}
		
		finally
		{ 
			System.out.println("Finally Block");
		}
		
		System.out.println("Program Completed");
		System.out.println("Program exited");
		
		

	}

}
