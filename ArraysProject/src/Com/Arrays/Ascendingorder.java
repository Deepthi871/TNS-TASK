package Com.Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class Ascendingorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 integer elements:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // sorts in ascending

        System.out.println("Array in ascending order: " + Arrays.toString(arr));
        sc.close();
    }
}