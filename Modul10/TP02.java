import java.util.Scanner;

public class TP02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int baris = 0; baris < n; baris++) {
            for (int kolom = 0; kolom < n; kolom++) {

                if (baris == kolom || baris + kolom == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}