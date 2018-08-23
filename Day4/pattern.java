import java.util.Scanner;

public class pattern
{
	public static void main(String[] arg)
	{
		Scanner a= new Scanner(System.in);
		System.out.println("Enter Row number upto you want to print");
		int n=a.nextInt();
	for(int i=n;i>0;i--)
	{
		for(int j=1;j<=i;j++)
		{
		System.out.print("*");
		}
		System.out.println("\n");
	}
	}
}
