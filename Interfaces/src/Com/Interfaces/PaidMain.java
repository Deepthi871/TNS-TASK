package Com.Interfaces;

public class PaidMain {

	public static void main(String[] args) {
		UPI upi = new UPI();
		CreditCard cc = new CreditCard();
		Cash c = new Cash();
		
		upi.payAmount(500);
		cc.payAmount(2300.02);
		c.payAmount(1230);
		
	}

}