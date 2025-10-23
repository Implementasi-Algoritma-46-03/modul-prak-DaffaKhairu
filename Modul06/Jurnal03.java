import java.util.Scanner;
public class Jurnal03 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        double r = s.nextInt();
        double h = s.nextInt();
        double t = s.nextInt();
        double pi = 3.14159;

        double volumeMaks = volume(pi, r, h);
        double volumeIsi = volumeSekarang(pi, r, t);
        double persen = persentase(volumeSekarang(pi, r, t), volume(pi, r ,h));

        System.out.printf("%.2f %.2f %.1f%s", volumeMaks, volumeIsi, persen, "%");
    }
    private static double volume(double pi, double r, double h) {
        return pi * r * r * h;
    } 
    private static double volumeSekarang(double pi, double r, double t) {
        return pi * r * r * t;
    }
    private static double persentase(double volumeSekarang, double volume) {
        return volumeSekarang / volume * 100;
    }
}