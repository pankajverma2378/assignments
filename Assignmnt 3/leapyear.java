import java.util.Scanner;
class year
{
	public static void main(String[] args)
	{
		Scanner a = new Scanner(System.in);
		System.out.println("Enter any year");
		int year = a.nextInt();
		boolean leap = false;
		
		if(year%400 == 0)
		{
			leap = true;
		}
		else if(year%100 == 0)
		{
			leap = false;
		}
		else if(year%4 == 0)
		{
			leap = true;
		}
		else
		{
			leap =false;
		}
		
		if(leap == true)
		{
			System.out.println("Year " + year + " is a leap year");
		}
		else
		{
			System.out.println("Year " + year +" is not a leap year");
		}
		
	}
	
}