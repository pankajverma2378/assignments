import java.util.Scanner;

class occurence
{
	public static void main(String[] args)
	{
		String str,substr;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter string : ");
		str = s.nextLine();
		
		System.out.print("Enter a string to search: ");
		substr = s.nextLine();
		
		System.out.println("\nEntered string : " + str);
		
		int p1 = str.length();
		int p2 = substr.length();
		int limit = p1 - p2;
		boolean found = false;
		for(int i=0;i<=limit;i++)
		{
			String txt = str.substring(i,i+p2);
			if(txt.equals(substr))
			{
				System.out.println("// Found '" + txt + "' at pos = " + i);
				found = true;
			}
		}
		System.out.println("Done");
		if(found == false)
			System.out.println("\nNot found.");
		
		s.close();
	}
}