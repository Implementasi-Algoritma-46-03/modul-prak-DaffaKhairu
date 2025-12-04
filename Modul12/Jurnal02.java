import java.util.Scanner;

public class Jurnal02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ukuranPapan = input.nextInt();
        int[][] papan = new int[ukuranPapan][ukuranPapan];
        
        // Input papan permainan
        // 0 = Kosong, 1 = O, 2 = X
        boolean adaTempatKosong = false;
        for (int i = 0; i < ukuranPapan; i++) {
            for (int j = 0; j < ukuranPapan; j++) {
                papan[i][j] = input.nextInt();
                if (papan[i][j] == 0) {
                    adaTempatKosong = true;
                }
            }
        }

        int pemenang = 0; // 0 berarti belum ada pemenang ditemukan

        // 1. Cek Baris & Kolom
        for (int i = 0; i < ukuranPapan; i++) {
            // Cek Baris ke-i
            boolean barisSama = true;
            int nilaiBaris = papan[i][0];
            if (nilaiBaris != 0) {
                for (int j = 1; j < ukuranPapan; j++) {
                    if (papan[i][j] != nilaiBaris) {
                        barisSama = false;
                        break;
                    }
                }
                if (barisSama) pemenang = nilaiBaris;
            }

            // Cek Kolom ke-i
            boolean kolomSama = true;
            int nilaiKolom = papan[0][i];
            if (nilaiKolom != 0) {
                for (int j = 1; j < ukuranPapan; j++) {
                    if (papan[j][i] != nilaiKolom) {
                        kolomSama = false;
                        break;
                    }
                }
                if (kolomSama) pemenang = nilaiKolom;
            }
        }

        // 2. Cek Diagonal Utama (kiri atas ke kanan bawah)
        boolean diagUtamaSama = true;
        int nilaiDiagUtama = papan[0][0];
        if (nilaiDiagUtama != 0) {
            for (int i = 1; i < ukuranPapan; i++) {
                if (papan[i][i] != nilaiDiagUtama) {
                    diagUtamaSama = false;
                    break;
                }
            }
            if (diagUtamaSama) pemenang = nilaiDiagUtama;
        }

        // 3. Cek Diagonal Samping (kanan atas ke kiri bawah)
        boolean diagSampingSama = true;
        int nilaiDiagSamping = papan[0][ukuranPapan - 1];
        if (nilaiDiagSamping != 0) {
            for (int i = 1; i < ukuranPapan; i++) {
                if (papan[i][ukuranPapan - 1 - i] != nilaiDiagSamping) {
                    diagSampingSama = false;
                    break;
                }
            }
            if (diagSampingSama) pemenang = nilaiDiagSamping;
        }

        // Menentukan Output
        if (pemenang == 1) {
            System.out.println("O");
        } else if (pemenang == 2) {
            System.out.println("X");
        } else if (adaTempatKosong) {
            System.out.println("?"); // Belum ada yang menang dan masih ada papan kosong
        } else {
            System.out.println("-"); // Papan penuh dan tidak ada yang menang (Seri)
        }
        
        input.close();
    }
}