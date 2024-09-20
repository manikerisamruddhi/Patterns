import java.util.*;


class HalfPyramid {
    public static void main(String args[]) {
        int n = 5;

        // Simple Pyramid
        // *
        // **
        // ***
        // ****
        System.out.println("Simple Pyramid");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Reverse Pyramid
        System.out.println("Reverse Pyramid");
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



        System.out.println("3rd Pyramid");
        for(int i=1;i<=n;i++) {
            //inner loop
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }

            //2nd inner loop
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }

            System.out.println(" ");
        }


        System.out.println("4th pyramid");

        for(int i=n;i>0;i--) {
            for(int j=0;j>n-i;j--) {
                System.out.print(" ");
            }

            for(int j=1;j<n-i;j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
