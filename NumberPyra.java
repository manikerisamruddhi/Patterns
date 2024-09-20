//     1  
//    2 2  
//   3 3 3  
//  4 4 4 4  
// 5 5 5 5 5  

public class NumberPyra {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=5;i++) {

            //spaces 
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++) {
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }
    }
}
