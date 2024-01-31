package arrays;

import java.util.Scanner;

public class Store_Extract_Array_Elements1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the  array size");
	int size = sc.nextInt();
    int a[] = new int[size];
	System.out.println("enter the array elements");
	for(int i=0;i<size;i++)
	{
	  a[i] = sc.nextInt();
	}
	System.out.println("the array elements are: ");
	for(int i=0;i<size;i++)
	{
		System.out.println(a[i]);
	}	

  }
}
