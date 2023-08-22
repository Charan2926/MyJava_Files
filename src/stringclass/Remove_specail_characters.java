package stringclass;

public class Remove_specail_characters {

	public static void main(String[] args) {
	String s="Te$ty@ntr@";
	char[] ch = s.toCharArray();
	for(int i=0;i<s.length();i++)
	{
		if((ch[i]>='a'&&ch[i]<='z')&&(ch[i]>='A'&&ch[i]<='Z'))
		{
			System.out.println(ch[i]);
		}
		
	 }

  }

}
