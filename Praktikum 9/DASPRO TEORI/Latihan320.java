import java.util.Scanner;

public class Latihan320 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        System.out.print("Masukkan angka (1-12): ");
        int angka = sc.nextInt();

        //verifikasi angka input
        if (angka < 1 || angka > 12) {
            System.out.println("Angka tidak valid");
            return;
        }
        String namaBulan = bulan[angka - 1];
        System.out.println("Bulan ke-" + angka + " adalah " + namaBulan);
    }
}