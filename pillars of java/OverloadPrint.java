class display
{
	public void print()
	{
		System.out.println("Null Print() called");
	}
	public void print(int num)
	{
		System.out.println("The value of num is " +num);
	}
	public void print(float num)
	{
		System.out.println("The value of float num is " +num);
	}
}
class print
{
	public static void main(String[] args)
	{
		display obj = new display();
		System.out.println("Calling Print()");
		obj.print();
		System.out.println("Num Print()");
		obj.print(100);
		System.out.println("Float Print()");
		obj.print(150.65f);
	}
}