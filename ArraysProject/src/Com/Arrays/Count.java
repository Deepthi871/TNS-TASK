package Com.Arrays;
import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 integer elements:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to count: ");
        int key = sc.nextInt();

        int count = 0;
        for (int num : arr) {
            if (num == key) {
                count++;
            }
        }
        System.out.println(key + " occurs " + count + " times");
        sc.close();
    }
}