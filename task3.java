public class task3 {
    public static void main(String[] args) {
        int[][] matrix = {
            {12, 13, 15, 16},
            {11, 110, 121, 17},
            {17, 18, 100, 21}
        };

        int sumOfEvenNumbers = 0;

        // Divide each even number by 2
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0) {
                    matrix[i][j] /= 2;
                }
            }
        }

        System.out.println("Odd numbers in the matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 != 0) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }

        // Sum of updated even numbers
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0) {
                    sumOfEvenNumbers += matrix[i][j];
                }
            }
        }

        System.out.println("Sum of updated even numbers: " + sumOfEvenNumbers);
    }
}
