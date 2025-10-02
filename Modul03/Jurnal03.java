import java.util.Scanner;
public class Jurnal03 {

    public static void main(final String[] args) {
        Scanner input = new Scanner (System.in);
        int nilaiP = input.nextInt();
        int nilaiA = input.nextInt();
        int nilaiB = input.nextInt();

        double NA = (0.25* nilaiP + 0.35 * nilaiA + 0.40 * nilaiB); 
        System.out.printf("%.2f\n", NA);
        System.out.printf("Lulus MK: " + (NA >=75) );
        

    }
}
