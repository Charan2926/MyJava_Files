package strings;

import java.util.Scanner;

public class Count_no_of_words_in_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String s = sc.nextLine();
		int count=1;
		for(int i=1;i<s.length()-1;i++) 
		{
			if (s.charAt(i)==' ')
			{
			  count++;
			}
		}
		System.out.println("The no of vowels in a String are : " + count);
			
	}

}
