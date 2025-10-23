import java.util.Scanner;
public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        String lirik = s.nextLine();

        System.out.println(ubahVokal2(ubahVokal(lirik)));

    }
    private static String ubahVokal(String lirik) {
        if (lirik.length() % 5 == 0)
            return lirik.replaceAll("[aiueo]", "a");
        else if (lirik.length() % 5 == 1)
            return lirik.replaceAll("[aiueo]", "e");
        else if (lirik.length() % 5 == 2)
            return lirik.replaceAll("[aiueo]", "i");
        else if (lirik.length() % 5 == 3)
            return lirik.replaceAll("[aiueo]", "o");
        else
            return lirik.replaceAll("[aiueo]", "u");
    }

    private static String ubahVokal2(String ubahVokal) {
        if (ubahVokal.length() % 5 == 0)
            return ubahVokal.replaceAll("[AIUEO]", "A");
        else if (ubahVokal.length() % 5 == 1)
            return ubahVokal.replaceAll("[AIUEO]", "E");
        else if (ubahVokal.length() % 5 == 2)
            return ubahVokal.replaceAll("[AIUEO]", "I");
        else if (ubahVokal.length() % 5 == 3)
            return ubahVokal.replaceAll("[AIUEO]", "O");
        else
            return ubahVokal.replaceAll("[AIUEO]", "U");
    }
}