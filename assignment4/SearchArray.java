import java.util.*;
class Search
{
	public static void main(String[] args)
	{
		int i,n,flag=0;
		Scanner s = new Scanner(System.in);
		int arr[] = new int[]{1,4,6,7,8,9,10};
		System.out.println("Enter any number you want to search");
		n = s.nextInt();
		for(i=0;i<7;i++)
		{
			if(n == arr[i])
			{
				flag = 1;
			}
		}
		if(flag == 1)
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}
	}
}