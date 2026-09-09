package Com.polymorphism;

class parent {
	public void property()
	{
		System.out.println("This property is belongs to parent");
	}
}
public class OverrideDemo extends parent{
	public void property()
	{
		System.out.println("this property is belongs to child");
	}
}