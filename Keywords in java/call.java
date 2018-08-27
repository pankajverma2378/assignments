class call
{
	int a;
	
call()
{
	this(10);
	System.out.println("Inside Default constructer the value of A declared = " +a);
}

call(int a)
{
	this.a = a;
	System.out.println("Inside Parameterized constructer");
}

public static void main(String[] args)
{
	call obj = new call();
}
}