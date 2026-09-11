package Com.keywords;

public final class FinalDemo {
	
	final int accNo = 2345;
	String HName = "Vishal";
	String BName = "Axis";
	
	public FinalDemo(String hName, String bName) {
		super();
		//this.accNo = accNo;
		HName = hName;
		BName = bName;
	}
	public void showDetails()
	{
		System.out.println("The AccNo is: "+accNo);
		System.out.println("The HolderName is: "+HName);
		System.out.println("The BankName is: "+BName);
	}
	final public void LoanRules()
	{
		System.out.println("if any EMI missed the cibil should be decrese");
		System.out.println("if any EMI is not missed the cibil should be Increase");
	}
}

/*class Customer extends Bank{

public Customer(String hName, String bName) {
	super(hName, bName);
}

public void showCustomer()
{
	System.out.println("Hi This is your customer");
}

/*public void LoanRules()
{
	System.out.println("if any EMI missed the cibil should be not decrease");
	System.out.println("if any EMI is not missed the cibil should be Increase");
}*/