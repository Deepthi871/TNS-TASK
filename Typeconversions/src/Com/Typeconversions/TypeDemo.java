package Com.Typeconversions;

public class TypeDemo {
	public void implicittype()
	{
		int x = 20;
		long l = x;
		System.out.println("this is implicit type conversion"+l);
		
		float f = 23.4f;
		double d = f;
		System.out.println("this is implicit type conversion : "+d);
	}
	public void explicittype()
	{
		long ll = 20;
		int xx = (int)ll;  //explicit type conversion
		System.out.println("this is explicit type conversion"+xx);
		
		double a = 234.56;
		float b = (float) a;
		System.out.println("this is explicit type conversion : "+b);
		
	}
}