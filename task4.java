public class task4 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int i = 0, num = 1;

        // Populate the array with squares
        do {
            arr[i] = (num * num);
            num++;
            i++;
        } while (i < 10);

        int sumOddNumbers = 0;
        i = 0;

        // Sum odd numbers and break at 81
        while (i < arr.length) {
            if (arr[i] == 81) break;
            if (arr[i] % 2 != 0) {
                sumOddNumbers += arr[i];
            }
            i++;
        }

        System.out.println("Sum of odd numbers before 81: " + sumOddNumbers);
    }
}
