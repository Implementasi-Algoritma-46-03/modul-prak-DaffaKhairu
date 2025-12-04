import java.util.Scanner;

public class Jurnal01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ukuranMatriks = input.nextInt();
        
        int[][] matriks = new int[ukuranMatriks][ukuranMatriks];

        // Membaca input isi matriks
        for (int i = 0; i < ukuranMatriks; i++) {
            for (int j = 0; j < ukuranMatriks; j++) {
                matriks[i][j] = input.nextInt();
            }
        }

        // Menampilkan matriks yang dicerminkan (loop baris dari bawah ke atas)
        for (int i = ukuranMatriks - 1; i >= 0; i--) {
            for (int j = 0; j < ukuranMatriks; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }
        
        input.close();
    }
}