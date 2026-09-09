package Com.polymorphism;

public class OverloadDemo {
	OverloadDemo()
	{
		
	}
	OverloadDemo(int a)
	{
		
	}
	
	public void show()
	{
		System.out.println("Hello");
	}
	public void show(int a,float b)
	{
		System.out.println("the values are"+a+","+b);
	}
	public void show(float b,int a)
	{
		System.out.println("the values are"+b+","+a);
	}
	
}