import java.util.Scanner;

public class Latihan120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] bil = new int[60];

        for (int i = 0; i < 60; i++) {
            System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
            bil[i] = sc.nextInt();
        }

        for (int i = 0; i < 60; i++) {
            System.out.println(bil[i]);
        }
    }
}