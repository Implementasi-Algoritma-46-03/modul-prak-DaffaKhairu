import java.util.Scanner;

public class Jurnal03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n <= 1) {
            System.out.println("BUKAN");
        } else {
            boolean prima = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    prima = false;
                    break;
                }
            }
            if (prima) {
                System.out.println("YA");
            } else {
                System.out.println("BUKAN");
            }
        }
        input.close();
    }
}
