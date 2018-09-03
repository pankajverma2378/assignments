abstract class Animals
{
	protected String color, breed, name;
	
	abstract void eat();
	void speak()
	{
		System.out.println("\nI'm an Animal.");
		System.out.println("Name : " + name);
		System.out.println("Color : " + color);
		System.out.println("Breed : " + breed);
	}
}
class Cat extends Animals
{
	Cat(String color, String breed, String name)
	{
		this.color = color;
		this.breed = breed;
		this.name = name;
	}
	
	void eat()
	{
		System.out.println("\n< cat eating food >");
	}
}
class abstct
{
	public static void main(String[] args)
	{
		Cat c = new Cat("Brown","Munchkin Cat","Tom");
		c.eat();
		c.speak();
		System.out.println();
	}
}