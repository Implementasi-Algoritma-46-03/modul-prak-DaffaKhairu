import java.util.Scanner;

public class Jurnal02 {
    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        String kalimat = input.nextLine();
        String[] kata = kalimat.split(" ");
        String hasil = "";

        for (String k : kata) {
            if (!k.equals("")) {
                hasil += k + " ";
            }
        }

        System.out.println(hasil.trim());
    }
}