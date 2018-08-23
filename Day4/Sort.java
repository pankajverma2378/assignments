public class Sort
{
	public static void main(String[] args)
	{
		int arr[] = new int[] {1,1,1,1,0,0,1,0};
		int i,temp;
		for(i=0;i<8;i++)
		{
			for(int j=i+1;j<8;j++)
			{
				if(arr[j]<arr[i])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(i=0;i<8;i++)
		{
			System.out.println(arr[i]);
		}
	}
}