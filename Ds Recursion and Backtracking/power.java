import java.util.*;
class power
{
	public static int a,b;
	public static int power(int a,int b)
	{
		if(a>0&&b>0)
		return (a*power(a,b-1));
		else if(b == 0)
			return 1;
		else 
			return 0;
	}

	public static void main(String[] args)
	{
		System.out.println("Enter two numbers : ");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		int result = power(a,b);
		System.out.println("Result : " +result);
	}
}