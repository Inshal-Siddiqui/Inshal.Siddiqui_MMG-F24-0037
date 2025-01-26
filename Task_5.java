public class Task_5 {
    public static void main(String[] args) {
        char[][] matrix = {
            {'1', '1', '0', '0', '1'},
            {'1', '0', '1', '0', '1'},
            {'1', '0', '0', '1', '1'},
            {'1', '0', '0', '0', '1'}
        };
        boolean containsN = false;
        for (char[] row : matrix) {
            for (char element : row) {
                if (element == 'N') {
                    containsN = true;
                    break;
                }
            }
        }
        System.out.println(containsN ? "Matrix contains 'N'." : "Matrix does not contain 'N'.");
    }
}
