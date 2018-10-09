import java.util.Scanner;

class Student implements Comparable
{
	private String name;
	private int age;
	
	void setName(String name)
	{
		this.name = name;
	}
	
	void setAge(int age)
	{
		this.age = age;
	}
	
	String getName()
	{
		return this.name;
	}
	
	int getAge()
	{
		return this.age;
	}
	
	public int compareTo(Object obj)
	{
		Student s = (Student)obj;
		if( this.getName().compareTo(s.getName()) > 0 )
			return 1;
		else if( this.getName().compareTo(s.getName()) == 0 )
		{
			if(this.getAge() > s.getAge())
				return 1;
			else if(this.getAge() == s.getAge())
				return 0;
			else
				return -1;
		}
		else
			return -1;
	}
}
class GenericSort
{	
	static <T extends Comparable> void sortArray(T arr[])
	{
		System.out.println("\n> Sorting the Array...");
		for(int i=1;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i;j++)
			{
				if(arr[j].compareTo(arr[j+1]) > 0)
				{
					T temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("> ...Done!");
	}

	static <T extends Student> void display(T arr[])
	{
		System.out.println("\nThe array:-");
		for(int i=0;i<arr.length;i++)
			System.out.println("Name : " + arr[i].getName() + "\tAge : " + arr[i].getAge());
		System.out.println();
	}
}

 class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int size = sc.nextInt();
		
		Student arr[] = new Student[size];
		System.out.println("\nStart entering the names of students followed by their age :-");
		for(int i=0;i<size;i++)
		{
			sc.nextLine();
			String name = sc.next();
			int age = sc.nextInt();
			arr[i] = new Student();
			arr[i].setName(name);
			arr[i].setAge(age);
		}
		
		GenericSort.display(arr);
		GenericSort.sortArray(arr);
		GenericSort.display(arr);

		System.out.println();
	}
}