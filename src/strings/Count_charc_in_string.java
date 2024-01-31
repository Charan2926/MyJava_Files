package strings;

import java.util.Scanner;

public class Count_charc_in_string {

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
			  count++;
			}
		}
		if(count>0)
		{
			System.out.println("yes the specific char is there in the string :"+ count);	
		}
		else
		{
			System.out.println("no the char is not there in the string :");	
		}
	}

}
