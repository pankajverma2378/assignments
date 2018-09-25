import java.util.*;
class sum
{
	public static int sum(int a)
	{
		int rem;
		
		if(a>0)
		{
			rem = a%10;
	return rem+sum(a/10);
		}
		else return 0;
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		int a = s.nextInt();
		System.out.println("Sum of digits = " +sum(a));
	}
}