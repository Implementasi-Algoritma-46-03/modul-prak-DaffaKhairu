import java.util.Scanner;
public class Jurnal03 {

    public static void main(final String[] args) {
          Scanner s = new Scanner(System.in);
        int Dira = s.nextInt();
        int Radi = s.nextInt();
        int Idar = s.nextInt();

        if (Dira <= Radi && Radi<= Idar) {
            System.out.println("Dira, Radi, Idar");           
        }else if (Radi<=Idar && Idar<=Dira){
         System.out.println("Radi, Idar, Dira");   
        }else if (Idar<=Dira && Dira<=Radi) {
            System.out.println("Idar, Dira, Radi");
            
        }
    }
}
