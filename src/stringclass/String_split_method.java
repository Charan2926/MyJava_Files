package stringclass;

public class String_split_method {

	public static void main(String[] args) {
	String s="my name is charan";
	String[] str = s.split("");
	for(int i=s.length()-1;i>=0;i--) 
	{
		System.out.print(str[i]);
	}
 }

}
