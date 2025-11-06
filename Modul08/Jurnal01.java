import java.util.Scanner;

public class Jurnal01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble(); 
        int n = input.nextInt();      
        int waktu = 0;                
        while (waktu < n) {
            r = r / 2;     
            waktu += 10;   
        }

        System.out.printf("%.3f", r); 
        input.close();
    }
}