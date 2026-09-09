package Com.keywords;

class Demo{
	int a=10;  //instance 
	public void show()
	{
		int a=20;  //local 
		System.out.println(a);
		System.out.println(this.a);
	}
}
public class ThisKey {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.show();

	}

}