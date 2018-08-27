import java.util.Scanner;
class EvenNumbers
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int N,count=0,i;
		System.out.println("Enter a number upto which you want to print even numbers");
		N = s.nextInt();
		
		for(i=0;i<N;i++)
		{
			if(i%2 == 0)
			{
				System.out.println(+i);
				count ++;
			}
		}
		System.out.println("Total Number of even numbers upto " + N + " are : " + count);
	}
}
