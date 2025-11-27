import java.util.ArrayList;
import java.util.Scanner;

public class TP01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahPeserta = input.nextInt();
        input.nextLine();
        ArrayList<String> peserta = new ArrayList<>();

        for (int i = 0; i < jumlahPeserta; i++) {
            peserta.add(input.nextLine());
        }

        for (int i = 0; i < peserta.size(); i++) {
            System.out.println("Bulan " + (i + 1) + ": " + peserta.get(i));
        }
    }
}
