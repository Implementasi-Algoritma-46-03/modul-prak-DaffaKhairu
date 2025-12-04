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

        while (nilaiSaatIni <= n * n) {
            for (int i = batasAtas; i <= batasBawah; i++) {
                if (nilaiSaatIni > n * n) break;
                matriks[i][batasKiri] = nilaiSaatIni++;
            }
            batasKiri++;

            for (int i = batasKiri; i <= batasKanan; i++) {
                if (nilaiSaatIni > n * n) break;
                matriks[batasBawah][i] = nilaiSaatIni++;
            }
            batasBawah--;

            for (int i = batasBawah; i >= batasAtas; i--) {
                if (nilaiSaatIni > n * n) break;
                matriks[i][batasKanan] = nilaiSaatIni++;
            }
            batasKanan--;

            for (int i = batasKanan; i >= batasKiri; i--) {
                if (nilaiSaatIni > n * n) break;
                matriks[batasAtas][i] = nilaiSaatIni++;
            }
            batasAtas++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriks[i][j]);
                if (j < n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        input.close();
    }
}