import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        char[] const_arr = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char user_inp = sc.next().toLowerCase().charAt(0);
        boolean isConsonant = false;
        for (char c : const_arr) {
            if (c == user_inp) {
                isConsonant = true;
                break;
            }
        }
        System.out.println(isConsonant ? user_inp + " is a consonant." : user_inp + " is not a consonant.");
        sc.close();
    }
}
