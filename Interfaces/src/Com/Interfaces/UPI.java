package Com.Interfaces;

public class UPI implements Account{

	@Override
	public void payAmount(double amount) {
	
		System.out.println(name+" successfully paid amount using UPI");
		System.out.println("The amount is: "+amount);
		
	}

}