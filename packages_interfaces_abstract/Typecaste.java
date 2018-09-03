import java.util.Scanner;

class numbers
{
	private String a, b;
	private int n1,n2;
	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number 1 : ");
		a = sc.nextLine();
		System.out.print("Enter number 2 : ");
		b = sc.nextLine();
		
		n1 = Integer.parseInt(a);
		n2 = Integer.parseInt(b);
	}
	
	int max()
	{
		if(n1 > n2)
			return n1;
		else if(n1 < n2)
			return n2;
		else
		{
			System.out.print("numbers are same -> ");
			return n1;
		}
	}
}

class typcst
{
	public static void main(String[] x)
	{
		numbers obj = new numbers();
		obj.input();
		System.out.println("Max : " + obj.max());
	}
}