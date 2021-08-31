package javaprogrames;

public class FibonnaciSeries
{

	public static void main(String[] args)
	{
		int s1=0, s2=1, sum=0;
		System.out.print(s1+" "+s2);
		for (int i=2;i<10;i++)
		{
			sum=s1+s2;
			System.out.print(" "+sum);
			s1=s2;
			s2=sum;
			
		}

	}
}
