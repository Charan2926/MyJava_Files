package strings;

import java.util.Scanner;

public class Palindrome_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String s = sc.next();
		String rev ="";
		for(int i=s.length()-1;i>=0;i--) 
		{
			rev=rev+s.charAt(i);
		}
        if(s.equals(rev))
        {
        	System.out.println("this is palindrome string");
        }
        else
        {
        	System.out.println("this is not a palindrome string");
        }
	}

}
