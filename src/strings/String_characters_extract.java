package strings;

import java.util.Scanner;

public class String_characters_extract {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String s = sc.next();
		for(int i=0;i<s.length();i++) 
		{
			System.out.println(s.charAt(i));
		}
	}
}
