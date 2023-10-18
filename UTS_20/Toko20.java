package UTS_20;
import java.util.Scanner;

public class Toko20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Toko");
        System.out.print("Masukkan nama Anda: ");
        String nama = sc.nextLine();

        // Deklarasi variabel
        double totalHarga = 0;
        double totalDiskon = 0;
        int jumlahProduk = 0; // Menyimpan jumlah produk yang dibeli

        String lanjutTambahProduk = "Y";
        String tipeMember = ""; // Untuk menentukan tipe member

        // Perulangan yang digunakan untuk mengulangi inputan user pada produk, jumlah, dan diskon
        while (lanjutTambahProduk.equalsIgnoreCase("Y")) {
            System.out.print("Masukkan produk yang Anda beli: ");
            String produk = sc.nextLine();

            System.out.print("Banyaknya: ");
            int jumlah = sc.nextInt();

            System.out.print("Harga: ");
            double harga = sc.nextDouble();

            System.out.print("Diskon (%): ");
            double diskon = sc.nextDouble();

            // Perhitungan harga setelah diskon
            double hargaSetelahDiskon = harga - (harga * diskon / 100);
            double hargaTotal = hargaSetelahDiskon * jumlah;

            totalHarga += harga * jumlah; // Menghitung total harga sebelum diskon
            totalDiskon += harga * jumlah - hargaTotal; 
            jumlahProduk += jumlah; // Menginkremenkan jumlah produk yang dibeli

            System.out.print("Apakah Anda mau menambahkan produk (Y/N)? ");
            sc.nextLine(); // Untuk membersihkan inputan sebelumnya
            lanjutTambahProduk = sc.nextLine();
        }

        System.out.print("Apakah Anda punya kartu member (Y/N)? ");
        tipeMember = sc.nextLine(); // Pertanyaan untuk member atau tidak

        System.out.println("\n-------- Total Pembelian --------");
        System.out.println("Nama pelanggan: " + nama);
        System.out.println("Total item barang yang dibeli: " + jumlahProduk); // Menampilkan jumlah produk yang dibeli

        if (tipeMember.equalsIgnoreCase("Y")) {
            System.out.println("Tipe: Member");
            double diskonMember = totalHarga >= 200000 ? 0.1 * totalHarga : 0.05 * totalHarga;
            totalDiskon += diskonMember;
        } else {
            System.out.println("Tipe: Non-Member");
        }

        double totalBayar = totalHarga - totalDiskon; // Menghitung total yang harus dibayar setelah diskon

        System.out.println("SubTotal: " + totalHarga);
        System.out.println("Total Diskon: " + totalDiskon);
        System.out.println("Total yang Harus Dibayar: " + totalBayar);
    }
}
