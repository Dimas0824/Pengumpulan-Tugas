import java.util.Arrays;
import java.util.Scanner;

public class SortingNilai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int jumlahElemen = sc.nextInt();

        int[] nilai = new int[jumlahElemen];

        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + " : ");
            nilai[i] = sc.nextInt();
        }

        Arrays.sort(nilai);

        int nilaiTertinggi = nilai[jumlahElemen - 1];
        int nilaiTerendah = nilai[0];
        double total = 0;

        for (int i = 0; i < jumlahElemen; i++) {
            total += nilai[i];
        }

        double rataRata = total / jumlahElemen;

        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        System.out.println("Nilai rata-rata: " + rataRata);
    }
}