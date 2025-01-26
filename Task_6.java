import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        String result = (age >= 18) ? "You are eligible for voting." : "You are not eligible.";
        System.out.println(result);
        sc.close();
    }
}
