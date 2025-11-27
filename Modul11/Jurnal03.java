import java.util.ArrayList;
import java.util.Scanner;

public class Jurnal03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> data = new ArrayList<>();

        while (true) {
            int angka = input.nextInt();
            if (angka == -1) {
                break;
            }
            data.add(angka);
        }

        int modusTerbesar = 0;
        int frekuensiTertinggi = 0;

        for (int i = 0; i < data.size(); i++) {
            int nilai = data.get(i);
            int hitung = 0;

            for (int j = 0; j < data.size(); j++) {
                if (data.get(j) == nilai) {
                    hitung++;
                }
            }

            if (hitung > frekuensiTertinggi || (hitung == frekuensiTertinggi && nilai > modusTerbesar)) {
                frekuensiTertinggi = hitung;
                modusTerbesar = nilai;
            }
        }

        System.out.println(modusTerbesar);
    }
}
