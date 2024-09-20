public class InvertedHalfPyramid {
    public static void main(String[] args) {
        int n=5;
        //int count=1;
        for(int i=n;i>0;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print(n-i+1+" "); //or using System.out.print(count); we can achieve it
            }
            //count++;
            System.out.println(" ");
        }
    }
}
