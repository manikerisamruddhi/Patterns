public class NumberPyramid {
    public static void main(String[] args) {
        int n=5;
        System.out.println("1st Pyramid");
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }

        System.out.println("2nd Pyramid");
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }


        System.out.println("3rd Pyramid");
        for(int i=1;i<=n;i++) {
            for(int j=1; j<=n-i+1;j++) {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }

        System.out.println("4th Pyramid");
        int count=1;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }

        System.out.println("5th pyramid");
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                if((i+j)%2==0) {
                    System.out.print("1"+" ");
                } else {
                    System.out.print("0"+" ");
                }
            }
            System.out.println(" ");
        }
    }
}
