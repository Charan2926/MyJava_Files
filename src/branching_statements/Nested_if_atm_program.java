package branching_statements;

public class Nested_if_atm_program {

	public static void main(String[] args) {
		int pin =2926;
		int bal =20000,wa=5000;
		if(pin==2926) 
		{
			if(bal>=wa) 
			{
				System.out.println("amount withdrawn successfully");
				bal = bal-wa;
			}
			else 
			{
				System.out.println("Insufficient amount");
			}
		}
			
	   else 
	   {
		   System.out.println("technical error");		
			
	   }
          System.out.println("new bal after withdrawl is" + bal);
	}

}
