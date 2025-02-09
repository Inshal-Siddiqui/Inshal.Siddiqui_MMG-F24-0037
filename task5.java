import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[][] seats = new boolean[3][4];  // 3 rows and 4 columns

        int choice;
        do {
            System.out.println("1. Display available seats");
            System.out.println("2. Reserve a seat");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Available seats:");
                    for (int i = 0; i < seats.length; i++) {
                        for (int j = 0; j < seats[i].length; j++) {
                            System.out.print(seats[i][j] ? "[X] " : "[O] ");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.print("Enter row number (0-2): ");
                    int row = sc.nextInt();
                    System.out.print("Enter column number (0-3): ");
                    int col = sc.nextInt();

                    if (row >= 0 && row < seats.length && col >= 0 && col < seats[row].length) {
                        if (!seats[row][col]) {
                            seats[row][col] = true;
                            System.out.println("Seat reserved successfully!");
                        } else {
                            System.out.println("Seat is already reserved.");
                        }
                    } else {
                        System.out.println("Invalid row or column number.");
                    }
                    break;

                case 3:
                    System.out.println("Exiting the system...");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter a valid number (1-3).");
            }
        } while (choice != 3);

        sc.close();
    }
}
