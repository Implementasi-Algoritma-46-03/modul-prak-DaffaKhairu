import java.util.Scanner;

public class Jurnal03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int original = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            int faktorial = 1;

            int i = 1;
            while (i <= digit) {
                faktorial *= i;
                i++;
            }

            sum += faktorial;
            n /= 10;
        }

        if (sum == original) {
            System.out.println("YA");
        } else {
            System.out.println("BUKAN");
        }

        input.close();
    }
}