import java.util.Scanner;

public class IndividuTamabahanNo320 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int baris = sc.nextInt();

        // Loop untuk mengatur baris
        for (int i = 1; i <= baris; i++) {
            // Loop untuk mencetak spasi sebelum angka
            for (int j = 1; j <= baris - i; j++) {
                System.out.print("  ");
            }
            // Loop untuk mencetak angka dari 1 hingga i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Loop untuk mencetak angka dari i-1 hingga 1
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}