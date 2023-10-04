import java.util.Scanner;

public class Latihan220 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //main menu
        System.out.println("=============================");
        System.out.println(" Selamat Datang di toko buku");
        System.out.println("=============================");
        System.out.println("1. Kamus");
        System.out.println("2. Novel");
        System.out.println("3. jenis lainnya");
        System.out.print("Pilih jenis buku: ");
        String jenisBuku = scanner.nextLine();

        //inputan
        System.out.print("Masukkan jumlah buku: ");
        int jumlahBuku = scanner.nextInt();

        double diskon = hitungDiskon(jenisBuku, jumlahBuku);
        System.out.println("Total diskon: " + diskon + "%");
        double HargaBuku;
        System.out.println("Masukkan Harga buku: Rp ");
        HargaBuku = scanner.nextDouble();
        System.out.println("Diskon yang didapat: Rp " + ((diskon/100)* HargaBuku) ); // menampilkan diskon
        double totalBayar = (HargaBuku - ((diskon/100)* HargaBuku)); 
        System.out.print("Total bayar: " + totalBayar); // menampilkan total bayar
    }

    public static double hitungDiskon(String jenisBuku, int jumlahBuku) {
        double diskon = 0;

        if (jenisBuku.equals("1")) { // mengecek jenis buku kamus
            diskon = 10;
            if (jumlahBuku > 2) {
                diskon = 12;
            }
        } else if (jenisBuku.equals("2")) { // mengecek jenis buku novel
            diskon = 7;
            if (jumlahBuku > 3) {
                diskon = 9;
            } else if (jumlahBuku <= 3) {
                diskon = 8;
            }
        } else if (jenisBuku.equals("3")) { // mengecek jenis buku jenis lainnya
            if (jumlahBuku > 3) {
                diskon = 5;
            }
        } else {
            System.out.println("Jenis buku tidak tersedia"); // menampilkan pesan jika buku yang dipilih tidak valid
        }

        return diskon;
    }
}
