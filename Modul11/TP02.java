import java.util.ArrayList;
import java.util.Scanner;

public class TP02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah = input.nextInt();
        ArrayList<Integer> poin = new ArrayList<>();

        for (int i = 0; i < jumlah; i++) {
            poin.add(input.nextInt());
        }

        for (int i = 0; i < poin.size(); i++) {
            for (int j = i + 1; j < poin.size(); j++) {
                if (poin.get(j) > poin.get(i)) {
                    int temp = poin.get(i);
                    poin.set(i, poin.get(j));
                    poin.set(j, temp);
                }
            }
        }

        for (int i = 0; i < poin.size(); i++) {
            System.out.print(poin.get(i));
            if (i < poin.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}
