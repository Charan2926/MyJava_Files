package strings;

import java.util.Scanner;

public class Vowels_count_in_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String s = sc.nextLine();
		int count=0;
		for(int i=1;i<s.length();i++) 
		{
			char ch=s.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
			  count++;
			}
		}
          System.out.println(" no of vowels in a String are : " + count);
          
			

	}

}
