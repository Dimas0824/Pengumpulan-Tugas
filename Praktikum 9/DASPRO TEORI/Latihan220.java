import java.util.Scanner;

public class Latihan220 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];


        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan elemen-elemen array ke-" + (i + 1)+ ": ");
            array[i] = sc.nextInt();
        }

        System.out.println("Isi array secara terbalik:");

        for (int i = 9; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}