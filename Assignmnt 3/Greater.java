/*
public class Greater
{
	public static void main(String[] main)
	{
		int a,b,c;
		a=5;
		b=6;
		c=12;
		
		if(a>b && a>c)
		{
			System.out.println("a is biggest out of the three numbers");
		}
		else if(b>c && b>a)
		{
			System.out.println("b is biggest out of the three numbers");
		}
		else
		{
			System.out.println("c is biggest out of the three numbers");
		}
	}
}
*/
import java.util.Scanner;
public class Greater
{
	public static void main(String[] main)
	{
		System.out.println("Enter Three Numbers Press ENTER after each");
		Scanner n = new Scanner(System.in);
		int a,b,c;
		a=n.nextInt();
		b=n.nextInt();
		c=n.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("a is biggest out of the three numbers");
		}
		else if(b>c && b>a)
		{
			System.out.println("b is biggest out of the three numbers");
		}
		else
		{
			System.out.println("c is biggest out of the three numbers");
		}
	}
}
