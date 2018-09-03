interface Animal
{
abstract public void speak();

abstract public void eat();
}

class cat
{
	public void speak()
	{
		System.out.println("Speak: = Meaw Meaw");
	}
	public void eat()
	{
		System.out.println("Cat Eating");
	}
}
class dog
{
	public void speak()
	{
		System.out.println("Skeak: = Bhoww Bhoww");
	}
	public void eat()
	{
		System.out.println("Dog Eating");
	}
}
class out
{
public static void main(String[] args)
{
	System.out.println("Method for Cat implemented");
	cat c = new cat();
	 
	c.speak();
	c.eat();
	
	System.out.println("Method for Dog implemented");
	dog d = new dog();
	
	d.speak();
	d.eat();
}
}
