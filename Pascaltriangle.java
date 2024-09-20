public class Pascaltriangle {
        public static void main(String[] args) {
            int n = 5; // Number of rows to print
            for (int i = 0; i < n; i++) {
                // Print spaces to center-align the triangle
                for (int j = 0; j < n - i; j++) {
                    System.out.print(" ");
                }
    
                // Calculate and print values for each row
                int number = 1; // First number in each row is always 1
                for (int j = 0; j <= i; j++) {
                    System.out.print(number + " ");
                    // Calculate the next number using the binomial coefficient formula
                    number = number * (i - j) / (j + 1);
                    System.out.println("num is"+number);
                }
    
                // Move to the next row
                System.out.println();
            }
        }
}
    
