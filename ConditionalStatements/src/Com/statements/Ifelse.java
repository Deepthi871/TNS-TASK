package Com.statements;

class demo{
	int age = 3;
	public void eligibility() {
		if(age>18)
		{
			System.out.println("eligible for voting");
		}else {
			System.out.println("not eligible for voting");
		}
	}
}
public class Ifelse {

	public static void main(String[] args) {
		
		demo d = new demo();
		d.eligibility();
	}
}