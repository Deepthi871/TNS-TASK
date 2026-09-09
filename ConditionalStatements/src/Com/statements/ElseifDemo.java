package Com.statements;

public class ElseifDemo {
	public int marks = 78;
	public void calculate()
	{
		if(marks<=100 && marks>=90)
		{
			System.out.println("A Grade");
		}
		else if(marks<90 && marks>=70)
		{
			System.out.println("B Grade");
		}
		else if(marks<70 && marks>=50)
		{
			System.out.println("C Grade");
		}
		else {
				System.out.println("Fail");
		}
	}
}