package javaprogrames;

import java.util.Scanner;

public class PallandromeCheckNumber
{

	public static void main(String[] args)
	{
		
     Scanner sr =new Scanner(System.in);
     System.out.println("Enter Number");
     int num=sr.nextInt();
     int org_num=num;
     int rev=0;
     while (num!=0)
     {
    	 rev =rev*10+num%10;
    	 num=num/10;	
     }
     if (org_num==rev)
      {
    	System.out.println("This number is a pallandrome"); 
        
      }else {
    	  System.out.println("Number is not pallandrome");
      }
     
	}
}