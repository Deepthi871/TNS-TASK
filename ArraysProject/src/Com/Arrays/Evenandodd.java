package Com.Arrays;
import java.util.Scanner;

public class Evenandodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 integer elements:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Even numbers: ");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.print("\nOdd numbers: ");
        for (int num : arr) {
            if (num % 2!= 0) {
                System.out.print(num + " ");
            }
        }
        sc.close();
    }
}