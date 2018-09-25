import java.util.*;
class fibonacci
{
	public static int a=0,b=1,c=0;
	public static void display(int n)
	{
	
		if(n>0)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(c + " ");
			display(n-1);
		}
	}
/*	public static int display(int a,int b,int n)
	{
	
		if(n>0)
		{
			
			c=a+b;
			a=b;
			b=c;
			display(a,b,n-1);
			//System.out.print(c + " ");
			//display(n-1);
		}
		return c;
	}
	*/
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number upto which you want to print fibonacci series :");
		int n = s.nextInt();
		System.out.print(a +" "+b+" ");
		display(n-2);
	}
}