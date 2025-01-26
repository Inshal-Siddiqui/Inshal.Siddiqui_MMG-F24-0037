import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0], max = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        System.out.println("Smallest: " + min);
        System.out.println("Largest: " + max);
        System.out.println(max % 2 == 0 ? "Largest is a multiple of 2." : "Largest is not a multiple of 2.");
        sc.close();
    }
}
