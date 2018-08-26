/*Make Class Animal(with properties breed and colour and function speak()), class Dog and class Cat. Dog and Class inherit from Animal class.You need to override speak function of Animal Class. */
abstract class Animal
{
	String breed;
	String color;
	
	abstract public void speak();
}
class Dog extends Animal
{
	public void setBreed(String breed)
	{
		this.breed = breed;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public void speak()
	{
		System.out.println("Dog");
		System.out.println("Color = " +color+ " Breed = " +breed);
	}
}
class Cat extends Animal
{
	public void setBreed(String breed)
	{
		this.breed = breed;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public void speak()
	{
		System.out.println("Cat");
		System.out.println("Color = " +color+ "Breed = " +breed);
	}
}

class get
{
	public static void main(String[] b)
	{
	Dog d = new Dog();
	Cat c = new Cat();
	
	d.setBreed("German Sheffard");
	d.setColor("Black");
	
	c.setBreed("Munchkin Cat");
	c.setColor("Orange");
	
	d.speak();
	c.speak();
	}
}
