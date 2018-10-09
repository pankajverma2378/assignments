import java.util.Scanner;

class Main
{
	private static <T> void display(T arr[])				// Generic function to print arrays.
	{
		System.out.println("The entered array:-");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		System.out.println('\n');
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int size = sc.nextInt();
		
		System.out.println("----------------------");
		System.out.println("Enter 1 for Integer.");
		System.out.println("Enter 2 for Double.");
		System.out.println("Enter 3 for Character.");
		System.out.println("Enter 4 for String.");
		System.out.println("----------------------");
		System.out.print("Enter your choice : ");
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1:
					System.out.println("> Integer array created.");
					System.out.println("\nStart entering the elements :-");
					Integer ints[] = new Integer[size];
					for(int i=0;i<size;i++)
					{
						ints[i] = sc.nextInt();
					}
					
					display(ints);
					break;
			
			case 2:
					System.out.println("> Double array created.");
					System.out.println("\nStart entering the elements :-");
					Double doubles[] = new Double[size];
					for(int i=0;i<size;i++)
					{
						doubles[i] = sc.nextDouble();
					}
					
					display(doubles);
					break;
					
			case 3:
					System.out.println("> Character array created.");
					System.out.println("\nStart entering the elements :-");
					Character chars[] = new Character[size];
					for(int i=0;i<size;i++)
					{
						chars[i] = sc.next().charAt(0);
					}
					
					display(chars);
					break;
					
			case 4:
					System.out.println("> String array created.");
					System.out.println("\nStart entering the elements :-");
					String strings[] = new String[size];
					for(int i=0;i<size;i++)
					{
						strings[i] = sc.next();
					}
					
					display(strings);
					break;
			
			default:
					System.out.println("> Invalid option entered.");
		}

		System.out.println();
		sc.close();
	}
}