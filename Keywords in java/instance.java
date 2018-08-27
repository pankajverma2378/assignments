class parent
{
void display()
{
	System.out.println("Parent class");
}
}
class child extends parent
{
	void display()
	{
		super.display();
	}
	public static void main(String[] args)
	{
		child obj = new child();
		obj.display();
	}
}