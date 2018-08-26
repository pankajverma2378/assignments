import java.util.Scanner;
public class Palindrome
{
	public static void main(String[] args)
	{
	Scanner s = new Scanner(System.in);
	System.out.println("ENter a number to check if it is palindrome or not");
	int n,temp,sum=0,r;
	n = s.nextInt();
	temp = n;
	
	while(n>0)
	{
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
		
	}
	
	if(temp == sum)
	{
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println("Not a palindrome number");
	}
	
	}
}

