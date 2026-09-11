package Com.String;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Java");
		System.out.println(sb);
		
		sb.append(" programming ");
		System.out.println(sb);
		StringBuffer sb1 = new StringBuffer("Python");
		
		System.out.println(sb.capacity());
		System.out.println(sb.substring(5,12));
		
		System.out.println(sb.charAt(2));
		System.out.println(sb.equals(sb1));
		System.out.println(sb);
		
		StringBuilder sd = new StringBuilder("Hiii");
		System.out.println(sd);
	}
}