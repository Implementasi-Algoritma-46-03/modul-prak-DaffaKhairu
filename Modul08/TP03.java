import java.util.Scanner;

public class TP03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;   
        int jumlah;     

        jumlah = input.nextInt();  

        while (jumlah != 0) {      
            total += jumlah;      
            jumlah = input.nextInt(); 
        }

        System.out.println(total);
        input.close();
    }
}