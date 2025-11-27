import java.util.ArrayList;
import java.util.Scanner;

public class Jurnal01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> peserta = new ArrayList<>();

        while (true) {
            String nama = input.nextLine();
            if (nama.equals("-")) {
                break;
            }
            peserta.add(nama);
        }

        for (int i = 0; i < peserta.size(); i++) {
            System.out.println("Bulan " + (i + 1) + ": " + peserta.get(i));
        }
    }
}
