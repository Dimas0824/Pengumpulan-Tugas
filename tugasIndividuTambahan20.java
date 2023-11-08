import java.util.Scanner;

public class tugasIndividuTambahan20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            // Mencetak spasi sebelum angka
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }

            // Mencetak angka "*" dari 1 hingga i
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}