import java.util.Scanner;

public class Individu120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int N = sc.nextInt(); // Jumlah baris

        for (int i = 1; i <= N; i++) {
            // Membuat spasi sebelum angka
            for (int j = N - i; j > 0; j--) {
                System.out.print("  ");
            }

            // Mencetak angka dari 1 hingga i
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }

            System.out.println();
        }
    }
}
