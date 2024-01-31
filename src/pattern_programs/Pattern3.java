package pattern_programs;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of rows");
		int r=sc.nextInt();
		System.out.println("enter no of columns");
		int c=sc.nextInt();
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				if(j>=i) 
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
