import java.util.Scanner;

public class TP02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();   // contoh: 123
        int reversed = 0;

        while (N != 0) {
            int digit = N % 10;             
            reversed = reversed * 10 + digit; 
            N = N / 10;                      
        }

        System.out.println(reversed); 
        input.close();
    }
}
