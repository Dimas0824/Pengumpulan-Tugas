import java.util.Scanner;

public class Kubus20 {
    // Fungsi hitungLuas
    static int hitungLuas(int sisi) {
        return sisi * sisi;
    }

    // Fungsi hitungVolume rumusnya sisi * sisi * sisi
    static int hitungVolume(int sisi) {
        return hitungLuas(sisi) * sisi;
    }

    // Fungsi hitungLuasPermukaan rumusnya 6 * sisi * sisi
    static int hitungLuasPermukaan(int sisi) {
        return 6 * hitungLuas(sisi);
    }

    // Fungsi main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sisi, volume, luasPermukaan;

        System.out.print("Masukkan panjang sisi kubus:");
        sisi = sc.nextInt();

        volume = hitungVolume(sisi);
        luasPermukaan = hitungLuasPermukaan(sisi);

        System.out.println("Volume Kubus adalah " + volume);
        System.out.println("Luas Permukaan Kubus adalah " + luasPermukaan);
    }
}