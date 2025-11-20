import java.util.Scanner;

public class Jurnal02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah;
        int total = 0;
        int count = 0;

        jumlah = input.nextInt(); 
        while (jumlah != 0) {     
            total += jumlah;
            count++;
            jumlah = input.nextInt(); 
        }

        double rataRata = (double) total / count;
        System.out.printf("%.2f", rataRata); 
        input.close();
    }
}
