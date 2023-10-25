import java.util.Scanner;

public class Latihan420 {
    public static void main(String[] args) {
        int[] bil = new int[8];
        double total = 0;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
            bil[i] = input.nextInt();
            total += bil[i];
        }
        
        double rata2 = total / 8;
        System.out.println("Rata-rata bilangan: " + rata2);
    }
}