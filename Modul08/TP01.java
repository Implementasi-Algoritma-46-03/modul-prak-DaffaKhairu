import java.util.Scanner;

public class TP01 {
    public static void main(String[] args) {
       Scanner nig = new Scanner (System.in);
        int N = nig.nextInt();
        int A = 30;
        int M = 0;

        while (A<N) {
            A = A*2;
            M += 15;

        }
        System.out.println(M);
         nig.close();

    
    }
}