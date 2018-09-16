import java.util.*;
class palindrome
{
	String str,rev;
	public boolean checkpalindrome()
	{
		if(str.equals(rev))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void setStr(String str)
	{
		this.str  = str;
	}
	public String getStr()
	{
		return str;
	}
	public String getRev()
	{
		return rev;
	}
	public void findRev()
	{
		rev = new String("");
		int i = 0,len = str.length();
		char c;
		while(i<len)
		{
			c = str.charAt(len-i-1);
			rev += c;
			i++;
		}
	}
}
class Calculate
{
	public static void main(String[] args)
	{
		palindrome obj = new palindrome();
		System.out.println("Enter your String");
		Scanner s=new Scanner(System.in);
		String str=s.next();
		obj.setStr(str);
		obj.findRev();
		System.out.println("Entered String : " +obj.getStr());
		System.out.println("Reversed String : " +obj.getRev());
		System.out.println("Is The Entered String Palindrome?"+obj.checkpalindrome());
	}
		
}