import java.util.Scanner;
class Complex
{
int real;
int imaginary;

void Display()
{
System.out.println(real+"+"+imaginary+"i");
}
}
class input {
  public static void main(String[] args) {

Scanner scan= new Scanner (System.in);
Complex rec=new Complex ();

rec.real=scan.nextInt();
rec.imaginary= scan.nextInt();

rec.Display();

  }
}
