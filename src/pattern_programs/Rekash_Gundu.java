package pattern_programs;

import java.util.Scanner;

public class Rekash_Gundu {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rows");
		int r=sc.nextInt();
		System.out.println("enter the columns");
		int c=sc.nextInt();
		int k=1,l=2;
		for(int i=1;i<=r;i++)
		{
			
			for(int j=1;j<=c;j++) 
			{
				if(i==1||j==3)
				{
					System.out.print(k);
					k=k*2;
				}
				else {
					System.out.print(l);
				    
						
				}
			}
			System.out.println();
		}
	
	}

}
