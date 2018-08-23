import java.util.Scanner;
 class Prime
 {
	 public static void main(String[] args)
	 {
		 Scanner s = new Scanner(System.in);
		 int N,count=0,i,flag=0;
		 System.out.println("Enter a number upto which you want to print prime numbers");
		 N = s.nextInt();
		  for(i=2;i<N;i++)
		  {
			  for(int j=2;j<i;j++)
			  {
				  if(i%j == 0)
				  {
					flag = 1; 
				  }
			  }
			  if(flag==0)
			  {
				  System.out.println(+i);
				  count++;
			  }
		  }
		   System.out.println("Total number of prime numners are" + count);
	 }
 }
		 