import java.util.Scanner;


public class Jurnal01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner inputScanner = new Scanner(System.in);
        int angka = inputScanner.nextInt();
        int nomor = angka / 1000;
        int sisa = angka % 1000;

        System.out.println(nomor);
        System.out.println(sisa);
        inputScanner.close();
    }
}
