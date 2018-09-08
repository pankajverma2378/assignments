class reverse
{
	public static void main(String[] args)
	{
		String str = "Hello World!";
		String rev = "";
		char c;
		int i,len = str.length();
		for(i=0;i<len;i++)
		{
			c = str.charAt(len-i-1);
			rev = rev.concat(""+c);
		}
		
		System.out.println("String : " + str  );
		System.out.println("Reversed String = " + rev );
		System.out.println();
	}
}