import java.util.Scanner;

public class Jurnal03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();       
        char O = scanner.next().charAt(0);
        int B = scanner.nextInt();      

     switch (O) {
            case '+':
                System.out.println(A + B);
                break;
            case '-':
                System.out.println(A - B);
                break;
            case '*':
                System.out.println(A * B);
                break;
            case '/':
                if (B == 0) {
                    System.out.println("Error: Division by zero");
                } else {
                    double hasil = (double) A / B;
                    // cetak dengan 7 angka di belakang koma (dibulatkan)
                    System.out.printf("%.7f%n", hasil);
                }
                break;
            default:
                System.out.println("Operator tidak valid");
        }

        scanner.close();
    }
}