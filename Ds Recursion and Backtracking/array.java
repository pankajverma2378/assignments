import java.util.*;
class array{
	
	public static boolean search(int[] arr,int M)
	{
		if(arr.length==0)
		{
			return false;
		}
		int smallarray[] = new int[arr.length-1];
		for(int i=0;i<smallarray.length;i++)
		{
			smallarray[i] =arr[i+1];
		}
		if(arr[0] == M)
		{
			return true;
		}
		else
		{
			return 	search(smallarray,M);
		}
	}
	public static void main(String[] args)
	{
		int i,M;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Size of array");
		int N = s.nextInt();
		System.out.println("Enter array Elements :");
		int arr[] = new int[N];
		for(i=0;i<N;i++)
		{
			arr[i] = s.nextInt();
		}
		System.out.println("Entered Array :");
		for(i=0;i<N;i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println("Enter an element to search :");
		M = s.nextInt();
		search(arr,M);
		System.out.println(search(arr,M));
	}
}