/*
Q6. Remove punctuation from string
*/

import java.util.Scanner;
class Punctuation
{
	static String newStr = new String("");
	
	public static String removePunctuation(String str,int i)
	{
		if(i == str.length())
			return newStr;
		else
		{
			char ch = str.charAt(i);
			if((ch>='a'&&ch<='z') || (ch>='A'&&ch<='Z') || ch==' ' || (ch>='0'&&ch<='9'))
				newStr += ch;
			return removePunctuation(str,++i);
		}
	}
}
class q6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);		
		System.out.print("Enter string : ");
		String str = sc.nextLine();
		
		System.out.println("\nAfter removing punctuations, String : " + Punctuation.removePunctuation(str,0));;
		System.out.println();
	}
}