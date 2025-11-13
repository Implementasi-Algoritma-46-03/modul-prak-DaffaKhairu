import java.util.*;
public class Jurnal03 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();

        int angkaa = 0;
        String hasil = null;
        for (int i= 1; i <= angka; i++) {
            if (angka % i == 0)
            angkaa++;
        }

        if (angkaa == 2)
            hasil = "YA";
        else 
            hasil = "BUKAN";

        System.out.println(hasil);
    }
}