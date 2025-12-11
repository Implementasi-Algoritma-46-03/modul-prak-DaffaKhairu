import java.util.Scanner;

public class Jurnal03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        String[] inventaris = new String[n];

        for (int i = 0; i < n; i++) {
            inventaris[i] = input.next();
        }

       
        String key = input.next();

        
        for (int i = 1; i < n; i++) {
            String temp = inventaris[i];
            int j = i - 1;
            while (j >= 0 && inventaris[j].compareTo(temp) > 0) {
                inventaris[j + 1] = inventaris[j];
                j--;
            }
            inventaris[j + 1] = temp;
        }

        
        int left = 0;
        int right = n - 1;
        int foundIndex = -1; 

        while (left <= right) {
            int mid = (left + right) / 2;
            int result = key.compareTo(inventaris[mid]);

            if (result == 0) { 
                foundIndex = mid;
                break;
            } else if (result > 0) { 
                left = mid + 1;
            } else { 
                right = mid - 1;
            }
        }

       
        if (foundIndex != -1) {
            System.out.println("Ditemukan di indeks ke-" + foundIndex);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}