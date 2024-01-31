package strings;

import java.util.Scanner;

public class Check_specificChar_in_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String s = sc.next();
		System.out.println("enter the characters");
		char c = sc.next().charAt(0);
		int count=0;
		for(int i=0;i<s.length();i++) 
		{
			if(c==s.charAt(i))
			{
				System.out.println("the specific char of string are  :"+ c);
				System.out.println("the index value of specific elementr is : "+ s.indexOf(c));
			}
			
		}

	}

}
