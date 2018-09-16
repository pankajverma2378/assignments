import java.util.Scanner;
import java.lang.*;

class subsequence
{
	public static void main(String args[])
	{
		System.out.print("Enter string: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		System.out.println("Entered String: " + input);
		
		sub(input);
		System.out.println();
		
		
	}
	static void sub(String input)
	{
		int len=input.length();
		
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<=len;j++)
			{
				
				System.out.print("{"+input.substring(i,j)+"}  ");//i is included and j is excluded 
				
			}
			
			
		}
	}
	
		
		
}
