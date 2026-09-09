package Com.Scanner;

public class CustomerDemo {
	public  CustomerDemo() 
	{
		//Default constructer
		//0 parameters and the con name is same as class name
		// no return type 
		//final,static,syn
		System.out.println("Hello Default");
	}
	public String name;
	public int age;
	
	public CustomerDemo(String name,int age)
	{
		System.out.println("Hello Parameterized");
	}
	public static void main(String args[])
	{
		CustomerDemo d = new CustomerDemo();
		CustomerDemo d1 = new CustomerDemo("Nikhitha",100);
	}
	
}