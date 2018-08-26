abstract class Vehicle
{
	abstract public void Start();
	public void Stop()
	{
		System.out.print("Stop() called for ");
	}
}
class twowheelar extends Vehicle
{
	public void Start()
	{
		System.out.println("Start() for twowheelar called");
	}
	public void Stop()
	{
		super.Stop();
		System.out.println("twowheelar");
	}
}
class fourwheelar extends Vehicle
{
	public void Start()
	{
		System.out.println("Start() for fourwheelar called");
	}
	public void Stop()
	{
		super.Stop();
		System.out.println(" fourwheelar");
	}
}
class vehicle1
{
	public static void main(String[] args)
	{
		twowheelar a = new twowheelar();
		fourwheelar b = new fourwheelar();
		
		a.Start();
		
		b.Start();
		
		a.Stop();
		
		b.Stop();
		
	}
}
