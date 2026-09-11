package Com.Abstraction;

public class AbstractionMain {

	public static void main(String[] args) {
		Addition a = new Addition();
		a.calculate();
		a.show(); 
		
		Subtraction s = new Subtraction();
		s.calculate();
		s.show();
		
		Multiplication m = new Multiplication();
		m.calculate();
		m.show();
	}

}