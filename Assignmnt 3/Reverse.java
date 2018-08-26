import java.util.Scanner;
class Reverse
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n,sum=0,r;
		System.out.println("Enter a number");
		n = s.nextInt();
		
		while(n>0)
		{
			r = n%10;
			sum = (sum*10)+r;
			n = n/10;
		}
		System.out.println("Reverse Of Number is : " + sum);
	}
}

		
		