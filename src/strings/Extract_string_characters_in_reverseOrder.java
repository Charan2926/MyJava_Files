package strings;

import java.util.Scanner;

public class Extract_string_characters_in_reverseOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String s = sc.next();
		for(int i=s.length()-1;i>=0;i--) 
		{
			System.out.println(s.charAt(i));
		}

	}

}
