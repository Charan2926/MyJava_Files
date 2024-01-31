package arrays;

import java.util.Scanner;

public class Extract_array_elements_in_reverse_order {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the  array size");
//		int size = sc.nextInt();
//	    int a[] = new int[size];
//		System.out.println("enter the array elements");
//		for(int i=0;i<size;i++)
//		{
//		  a[i] = sc.nextInt();
//		}
		int a[]= {1,5,6,8,9};
		System.out.println("the reverse order of an array is : ");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]);
		}	

	}

}
