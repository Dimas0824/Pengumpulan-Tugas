package ProjectSemester;

import java.util.Scanner;

public class Tugas_2_Pemesanan {

    public static void main(String[] args) {

        // deklarasi dan inisialisasi scanner, variable, dan array
        Scanner sc = new Scanner(System.in);

        System.out.println("Cafe The Orange!");

        System.out.print("Masukkan jumlah pelanggan: ");
        int customerCount = sc.nextInt();
        sc.nextLine();

        String[][] pesanan = new String[customerCount][40];

        // looping input pesanan untuk setiap pelanggan
        for (int i = 0; i < customerCount; i++) {
            System.out.println("Pelanggan ke-" + (i + 1) + ":");
            boolean session = true;
            int itemCount = 0;

            while (session) {
                System.out.print("Masukkan pesanan ke-" + (itemCount + 1) + " : ");
                String inputPesanan = sc.nextLine();
                pesanan[i][itemCount] = inputPesanan;
                itemCount++;

                // konfirmasi menambahkan menu
                System.out.print("Apakah anda ingin memesan lagi? (y/t) : ");
                char choice = sc.next().charAt(0);
                sc.nextLine();
                System.out.println();

                // jika selain y maka session menjadi false
                if (choice != 'y' && choice != 'Y') {
                    session = false;
                }
            }
        }

        // looping output pesanan satu persatu untuk setiap pelanggan
        for (int i = 0; i < customerCount; i++) {
            System.out.println("Pesanan pelanggan ke-" + (i + 1) + " : ");
            for (int j = 0; j < pesanan[i].length && pesanan[i][j] != null; j++) {
                System.out.println("> " + pesanan[i][j]);
            }
        }

        sc.close();
    }
}
