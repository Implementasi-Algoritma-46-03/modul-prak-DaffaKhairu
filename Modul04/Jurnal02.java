import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner (System.in);
        int Penghasilan  = scanner.nextInt();
        double pajak = 0;

        if (Penghasilan <=50) {
            pajak = Penghasilan * 1000000 * 0.05; 
            System.out.println("Penghasilan kotor = " + Penghasilan + " Juta Rupiah" );
            System.out.println("Pajak 5% = Rp. " + (int)pajak);
            System.out.println("Penghasilan bersih = Rp. " + (int)(Penghasilan *1000000 - pajak));
        }else if (Penghasilan <=250) {
            pajak = Penghasilan * 1000000 * 0.15; 
            System.out.println("Penghasilan kotor = " + Penghasilan + " Juta Rupiah" );
            System.out.println("Pajak 15% = Rp. " + (int)pajak);
            System.out.println("Penghasilan bersih = Rp. " + (int)(Penghasilan *1000000 - pajak));
        }else if (Penghasilan <=500) {
            pajak = Penghasilan * 1000000 * 0.25; 
            System.out.println("Penghasilan kotor = " + Penghasilan + " Juta Rupiah" );
            System.out.println("Pajak 25% = Rp. " + (int)pajak);
            System.out.println("Penghasilan bersih = Rp. " + (int)(Penghasilan *1000000 - pajak));
        }else {
            pajak = Penghasilan * 1000000 * 0.30; 
            System.out.println("Penghasilan kotor = " + Penghasilan + " Juta Rupiah" );
            System.out.println("Pajak 30% = Rp. " + (int)pajak);
            System.out.println("Penghasilan bersih = Rp. " + (int)(Penghasilan *1000000 - pajak));
        }
    
    }
}
