public class ZigZag {
    public static void main(String[] args) {
        int n = 25; // number of columns (can change to 5 or any number)

        // Loop through 3 rows for the zigzag
        for (int i = 1; i <= 3; i++) {
            // Loop through the columns
            for (int j = 1; j <= n; j++) {
                // Condition for printing stars
                if ((i + j) % 4 == 0 || (i == 2 && j % 4 == 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
