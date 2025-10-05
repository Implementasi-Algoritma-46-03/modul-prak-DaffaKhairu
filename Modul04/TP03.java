import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
         Scanner inputScanner = new Scanner(System.in);
        
        int jumlahPermen = inputScanner.nextInt();
        int jumlahTeman = inputScanner.nextInt();

        int totalOrang = jumlahTeman + 1;

        int jatahPerOrang = jumlahPermen / totalOrang;
        int sisaPermen = jumlahPermen % totalOrang;

        // output
        System.out.println(jatahPerOrang);
        System.out.println(sisaPermen);

        inputScanner.close();
    }
}