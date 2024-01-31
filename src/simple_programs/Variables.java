package simple_programs;

public class Variables {

	public static void main(String[] args) {
		int a=10;
		a=20;
		// int a=20; // same variable cannot be declared once.
		final int b=30;
		//b=40;// when a variable is declared as final,we cannot re-intialize
		System.out.println(a);
		System.out.println(b);

	}

}
