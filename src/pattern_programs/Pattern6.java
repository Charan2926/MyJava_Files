package pattern_programs;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of rows");
		int r=sc.nextInt();
		int s=1;
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
                System.out.print(s++);
			}
			System.out.println();
		} 
		for(int i=r;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
                System.out.print(s++);
			}
			System.out.println();
		}

	}

}
