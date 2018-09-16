import java.util.*;
class toggle
{
	public static void main(String arsg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your String");
		String str=s.nextLine();
		String t="";
		System.out.println("Entered String is : "+str);
		for(int i=0;i<str.length();i++)
		{
	
			if(Character.isLowerCase(str.charAt(i)))
			{
				
				t=t+Character.toUpperCase(str.charAt(i));
			
			}
			
			else if(Character.isUpperCase(str.charAt(i)))
			{
				
				t=t+Character.toLowerCase(str.charAt(i));
				
			}
			else 
			{
				t=t+str.charAt(i);
			}
		}
		System.out.println("Toggled String is : "+t);
		
		
	}
}