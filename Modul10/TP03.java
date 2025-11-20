public class TP03 {
    public static void main(String[] args) {

        for (int angka = 2; angka <= 100; angka++) {

            boolean prima = true;

            for (int i = 2; i <= Math.sqrt(angka); i++) {
                if (angka % i == 0) {
                    prima = false;
                    break;
                }
            }

            if (prima) {
                System.out.print(angka + " ");
            }
        }
    }
}