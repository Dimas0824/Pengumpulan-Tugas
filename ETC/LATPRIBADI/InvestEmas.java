package LATPRIBADI;

import java.util.Scanner;

public class InvestEmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah investasi awal: ");
        double modalAwal = scanner.nextDouble();
        System.out.print("Masukkan jumlah tahun: ");
        int tahun = scanner.nextInt();

        double nilaiAkhir = hitungInvestasi(modalAwal, tahun);
        System.out.printf("Nilai investasi setelah %d tahun adalah: %.2f\n", tahun, nilaiAkhir);
    }

    public static double hitungInvestasi(double modalAwal, int tahun) {
        double sukuBunga = 0.117; // 11.7%

        for (int i = 0; i < tahun; i++) {
            modalAwal *= (1 + sukuBunga);
        }

        return modalAwal;
    }
}