package Com.Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class ReverseofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 integer elements:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array: " + Arrays.toString(arr));

        // Reverse logic
        int[] rev = new int[5];
        for (int i = 0; i < 5; i++) {
            rev[i] = arr[4 - i];
        }

        System.out.println("Reversed Array: " + Arrays.toString(rev));

        // Palindrome check
        if (Arrays.equals(arr, rev)) {
            System.out.println("Array is Palindrome");
        } else {
            System.out.println("Array is NOT Palindrome");
        }
        sc.close();
    }
}