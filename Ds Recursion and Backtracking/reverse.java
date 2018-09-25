import java.util.*;
class reverse
{
	public static void reverse(int[] arr,int i,int j)
	{
		if(i<j/2)
		{
			int temp = arr[i];
			arr[i] = arr[j-i];
			arr[j-i] = temp;
			reverse(arr,++i,j--);
		}
	}
	public static void display(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] +" ");
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
			System.out.print(arr[i] +" ");
		System.out.println();
		}
		System.out.println("Reversed array");
		reverse(arr,0,arr.length-1);
		display(arr);
	}
}