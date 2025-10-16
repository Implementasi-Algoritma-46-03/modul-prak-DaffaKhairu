import java.util.Scanner;
public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.next();
        int h = input.nextInt();
        
        int hariApa = 0;
        switch (n) {
            case "Senin":
                hariApa = 1;
                break;
            case "Selasa":
                hariApa = 2;
                break;
            case "Rabu":
                hariApa = 3;
                break;
            case "Kamis":
                hariApa = 4;
                break;
            case "Jumat":
                hariApa = 5;
                break;
            case "Sabtu":
                hariApa = 6;
                break;
            case "Minggu":
                hariApa = 7;
                break;
            default:
                hariApa = 0;
                break;
        }

    int totalHari = hariApa + h;
    int harinya = totalHari % 7;

    String namaHari;
        switch (harinya) {
            case 1:
                namaHari = "Senin";
                break;
            case 2:
                namaHari = "Selasa";
                break;
            case 3:
                namaHari = "Rabu";
                break;
            case 4:
                namaHari = "Kamis";
                break;
            case 5:
                namaHari = "Jumat";
                break;
            case 6:
                namaHari = "Sabtu";
                break;
            case 7:
                namaHari = "Minggu";
                break;
            default:
                namaHari = "Hari tidak ditemukan";
        }

        System.out.println(namaHari); 
    }
}