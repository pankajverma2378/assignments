import java.util.Scanner;

class count
{
	public static void main(String[] args)
	{
		String line;
		int count = 1;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter string : ");
		line = s.nextLine();
		
		System.out.println("\nEntered line : " + line);
		if(line.length() == 0)
			count = 0;
		else
		{
			for(int i=0;i<line.length()-1;i++)
			{
				if(line.charAt(i) == ' ' && line.charAt(i+1) != ' ')
				{
					count++;
				}
			}
		}
		System.out.println("\nThe number of words : " + count);
		
		s.close();
	}
}