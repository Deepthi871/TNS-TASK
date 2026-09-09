package Pack1;

public class Sameclass {
	
	private int a=10;
	int b=20;
	protected int c=30;
	public int d=40;
	
	public static void main(String args[])
	{
		Sameclass ob1 = new Sameclass();
		System.out.println(ob1.a);  //same
		System.out.println(ob1.b);
		System.out.println(ob1.c);
		System.out.println(ob1.d);
	}
}