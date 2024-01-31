package pattern_programs;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of rows");
		int r=sc.nextInt();
	    int s=1;
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=r;j++)
			{
				System.out.print(s+"");
				s++;
			}
			System.out.println();
		}
	}
}
