import java.util.Scanner;

public class DeretDescendingRekursif20 {

    // Fungsi rekursif
    static void descendingRecrusif(int n) {
        if (n < 0) {
            return;
        }
        System.out.println(n);
        descendingRecrusif(n - 1);
    }

    // Fungsi iteratif
    static void printDescendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();

        System.out.println("Output Rekursif:");
        descendingRecrusif(angka);

        System.out.println("\nOutput Iteratif:");
        printDescendingIteratif(angka);
    }
}
