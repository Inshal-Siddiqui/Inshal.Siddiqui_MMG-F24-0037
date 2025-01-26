import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
            if (numbers[i] % 4 == 0) sum += numbers[i];
        }
        System.out.println("Sum of multiples of 4: " + sum);
        sc.close();
    }
}
