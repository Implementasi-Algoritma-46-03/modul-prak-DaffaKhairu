import java.util.Scanner;
public class Jurnal01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner s = new Scanner(System.in);

        String nama1 = s.nextLine();
        String nama2 = s.nextLine();
        int waktu = s.nextInt();

        System.out.println("Halo, " + nama1 + ". Selamat " + sapaan(waktu));
        System.out.println("Halo, " + nama2 + ". Selamat " + sapaan(waktu));
    }

    private static String sapaan(int a) {
        if (a >= 6 && a <= 11) {
            return "pagi.";
        } else if (a >= 12 && a <= 14) {
            return "siang.";
        } else if (a >= 15 && a <= 17) {
            return "sore.";
        } else {
            return "malam.";
        }
    }
}