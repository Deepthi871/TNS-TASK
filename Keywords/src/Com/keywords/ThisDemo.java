package Com.keywords;
class A{
	public void show() {
		System.out.println("this is show method");
	}
	public void show(int a)
	{
		this.show();
		System.out.println("this is display method");
	}
}
public class ThisDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		obj.show();
		obj.show(6);
	}

}