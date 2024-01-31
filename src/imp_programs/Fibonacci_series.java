package imp_programs;
import java.util.Scanner;
public class Fibonacci_series {
		public static void main(String[] args) 
		{
			fibonacci();
		}
		public static void fibonacci()
		{
		  Scanner sc =new Scanner(System.in);
		  System.out.println("enter a values");
		  int a =sc.nextInt();
		  System.out.println("enter b values");
		  int b=sc.nextInt();
		  int sum=0;
		  for(int i=0;i<=10;i++)
		  {
			  sum=a+b;
			  a=b;
			  b=sum;
			  System.out.println("the fibonacci num are"+ sum);
		  }    
		}
	}

	