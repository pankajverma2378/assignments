import java.util.*;
class nthfibonacci
{
	public static int c;
	public static int display(int a,int b,int n)
	{
	
		if(n>0)
		{
			c=a+b;
			a=b;
			b=c;
			display(a,b,n-1);
		}
		return c;
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number :");
		int n = s.nextInt();
		System.out.println("number AT pos :" + n + " is " +display(0,1,n-2));
	}
}