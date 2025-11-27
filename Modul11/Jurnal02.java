import java.util.Scanner;

public class Jurnal02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kalimat = input.nextLine();
        kalimat = kalimat.trim().replaceAll("\\s+", " ");
        System.out.println(kalimat);
    }
}
