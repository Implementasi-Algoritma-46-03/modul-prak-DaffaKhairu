import java.util.Scanner;
public class TP03 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int d = s.nextInt();
        int r = s.nextInt();
        int i = s.nextInt();

        if (d > r && d > i)
            System.out.println("Dira");
        else if (r > d && r > i)
            System.out.println("Radi");
        else
            System.out.println("Idar");
    }
}
