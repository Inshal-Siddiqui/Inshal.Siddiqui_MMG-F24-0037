import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[6];
        System.out.println("Enter 6 names:");
        for (int i = 0; i < 6; i++) {
            names[i] = sc.nextLine();
        }
        boolean found = false;
        for (String name : names) {
            if (name.equalsIgnoreCase("Ali")) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "Ali is in the array." : "Ali is not in the array.");
        sc.close();
    }
}
