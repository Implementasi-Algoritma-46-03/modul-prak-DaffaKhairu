import java.util.Scanner;

public class TP03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kalimat = input.nextLine().trim();
        String[] kata = kalimat.split("\\s+");
        System.out.println(kata.length);
    }
}
