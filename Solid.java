import java.util.*;

public class Solid {

    public void print(int n){

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }

    public static void main(String args[]) {

        Solid s=new Solid();
        s.print(5);
    }
}