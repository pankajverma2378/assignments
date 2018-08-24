import java.util.Scanner;

class array_sec_high {
  public static void main(String[] args) {

Scanner scan= new Scanner (System.in);

int arr[]= new int[10];

for (int i =0;i<10;i++)
{
  arr[i]=scan.nextInt();
}
int temp;
for (int i=0;i<10;i++)
{
  for (int j=i+1;j<10;j++)
  {
    if (arr[i]<arr[j])
    {
      temp=arr[i];arr[i]=arr[j];arr[j]=temp;
    }
  }
}
System.out.print(arr[1]);

  }
}
