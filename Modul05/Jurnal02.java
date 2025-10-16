import java.util.Scanner;
public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.next();
        int h = input.nextInt();
        
        int hariApa = 0;
        switch (n) {
            case "senin":
                hariApa = 1;
                break;
            case "selasa":
                hariApa = 2;
                break;
            case "rabu":
                hariApa = 3;
                break;
            case "kamis":
                hariApa = 4;
                break;
            case "jumat":
                hariApa = 5;
                break;
            case "sabtu":
                hariApa = 6;
                break;
            case "minggu":
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
                namaHari = "senin";
                break;
            case 2:
                namaHari = "selasa";
                break;
            case 3:
                namaHari = "rabu";
                break;
            case 4:
                namaHari = "kamis";
                break;
            case 5:
                namaHari = "jumat";
                break;
            case 6:
                namaHari = "sabtu";
                break;
            case 7:
                namaHari = "minggu";
                break;
            default:
                namaHari = "Hari tidak ditemukan";
        }

        System.out.println(namaHari); 
    }
}