import java.util.Scanner;

public class Jurnal03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[][] matriks = new int[n][n];

        int nilaiSaatIni = 1;
        int batasAtas = 0;
        int batasBawah = n - 1;
        int batasKiri = 0;
        int batasKanan = n - 1;

        // Loop sampai semua sel terisi (nilai mencapai N*N)
        while (nilaiSaatIni <= n * n) {
            
            // 1. Gerak ke BAWAH (mengisi kolom kiri)
            for (int i = batasAtas; i <= batasBawah; i++) {
                if (nilaiSaatIni > n * n) break;
                matriks[i][batasKiri] = nilaiSaatIni++;
            }
            batasKiri++; // Geser batas kiri ke kanan

            // 2. Gerak ke KANAN (mengisi baris bawah)
            for (int i = batasKiri; i <= batasKanan; i++) {
                if (nilaiSaatIni > n * n) break;
                matriks[batasBawah][i] = nilaiSaatIni++;
            }
            batasBawah--; // Geser batas bawah ke atas

            // 3. Gerak ke ATAS (mengisi kolom kanan)
            for (int i = batasBawah; i >= batasAtas; i--) {
                if (nilaiSaatIni > n * n) break;
                matriks[i][batasKanan] = nilaiSaatIni++;
            }
            batasKanan--; // Geser batas kanan ke kiri

            // 4. Gerak ke KIRI (mengisi baris atas)
            for (int i = batasKanan; i >= batasKiri; i--) {
                if (nilaiSaatIni > n * n) break;
                matriks[batasAtas][i] = nilaiSaatIni++;
            }
            batasAtas++; // Geser batas atas ke bawah
        }

        // Menampilkan matriks hasil
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriks[i][j] + "\t"); // Gunakan tab agar rapi
            }
            System.out.println();
        }
        
        input.close();
    }
}