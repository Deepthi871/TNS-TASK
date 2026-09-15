package Com.exceptionhandling;
public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            // Outer try block
            System.out.println("Outer try started");
            int a = 10, b = 0;

            // Nested try block 1
            try {
                System.out.println("Inner try 1: Division");
                int result = a / b; // ArithmeticException
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Caught in Inner catch 1: " + e);
            }

            // Nested try block 2
            try {
                System.out.println("\nInner try 2: Array access");
                int[] arr = new int[3];
                arr[5] = 100; // ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught in Inner catch 2: " + e);
            }

            System.out.println("\nOuter try continuing after inner blocks");

            // This will be caught by outer catch
            String s = null;
            System.out.println(s.length()); // NullPointerException

        } catch (Exception e) {
            System.out.println("Caught in Outer catch: " + e);
        } finally {
            System.out.println("\nFinally block always executes - cleanup code here");
        }

        System.out.println("\nProgram continues normally after handling...");
    }
}