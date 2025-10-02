import java.util.Scanner;
public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner input = new Scanner (System.in);
        int nilai1 = input.nextInt();
        int nilai2 = input.nextInt();
        int nilai3 = input.nextInt();

        double rata = (nilai1 + nilai2 + nilai3) / 3.0;
        System.out.printf("Nilai rata-rata : %.2f\n", rata);

    }
}
