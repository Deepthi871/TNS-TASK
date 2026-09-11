package Com.Interfaces;

public class CreditCard implements Account{

	@Override
	public void payAmount(double amount) {
		
		System.out.println(name+" successfully paid amount using Credit card");
		System.out.println("The amount is: "+amount);
		
	}

}