import java.util.*;
class digitsum
{
	public static int sum_of_digits(int a)
	{
		if(a>0)
		{
			int rem = a%10;
			return rem+sum_of_digits(a/10);
		}
		else
			return 0;
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String str = new String();
		str = s.next();
		int a =Integer.parseInt(str);
		System.out.println("Sum of digits =" +sum_of_digits(a));
	}
}
