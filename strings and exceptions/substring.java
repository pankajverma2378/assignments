class substring
{
	public static void main(String[] args)
	{
		String str = "XYZ";
		int i,j,k=1,len = str.length();
		
		System.out.println("Substrings of string = \"" + str + "\":-");
		for(i=0;i<len;i++)
		{
			for(j=i;j<len;j++)
			{
				System.out.println(k + ". " + str.substring(i,j+1));
				k++;
			}
		}
		System.out.println();
	}
}