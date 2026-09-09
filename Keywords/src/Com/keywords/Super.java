package Com.keywords;
class parent{
	int a =10;
	public void show()
	{
		System.out.println("This is show method");
	}
	public parent()
	{
		System.out.println("This is Constructor");
	}
}
class child extends parent{
	
	public void display()
	{
		//super(7);
		System.out.println(super.a);
		super.show();
		
	}
	
}
public class Super {

	public static void main(String[] args) {
		child ch = new child();
		ch.display();
		
	}

}