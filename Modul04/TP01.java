import java.util.Scanner;

public class TP01 {

    public static void main(final String[] args) {
       
          Scanner inputScanner = new Scanner(System.in);

        int saldoAwal = inputScanner.nextInt();
        int tabunganPerHari = inputScanner.nextInt();
        int jumlahHari = inputScanner.nextInt();

        int totalTabungan = saldoAwal + (tabunganPerHari * jumlahHari);

        System.out.println(totalTabungan);
        
        inputScanner.close();
    }
  }