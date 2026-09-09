package Com.Scanner;
import java.util.Scanner;
public class CustomerMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println("Enter your salary");
		double sal = sc.nextDouble();
		
		System.out.println("Name : "+name+"Age : "+age+" Salary : "+sal);
		
	}

}