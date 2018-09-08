import java.util.Scanner;

class remove
{
	public static void main(String[] ags)
	{
		StringBuffer str;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a string : ");
		str = new StringBuffer(s.nextLine());
		System.out.println("\nEntered string : " + str);
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) =='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'
			 || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U')
			{
				str.deleteCharAt(i);
				i--;
			}
		}
		System.out.println("\nFinal string : " + str + "\n");
		s.close();
	}
}