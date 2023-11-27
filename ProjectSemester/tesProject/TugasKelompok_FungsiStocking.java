package ProjectSemester.tesProject;

import java.util.Scanner;

public class TugasKelompok_FungsiStocking {

    static Scanner sc = new Scanner(System.in);

    static boolean session = true;
    static int pilihan;

    static void stock(String[][] items) {

        System.out.println();
        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║              Cafe the orange stok            ║");
        System.out.println("╚══════════════════════════════════════════════╝");
        System.out.println();
        int count = 1;
        for (int i = 0; i < items.length; i++) {
            if (items[i][0] != null) {
                System.out.println("[" + (count++) + "] tambah stok " + items[i][0] + " (" + items[i][2] + ")");
            }
        }
        System.out.println("[" + 20 + "] to exit");
    }

    static void AddStock(String[][] items, int pilihan) {

        System.out.print("Masukkan jumlah penambahan : ");
        int jumlah = sc.nextInt();

        items[pilihan - 1][2] = Integer.toString(Integer.parseInt(items[pilihan - 1][2]) + jumlah);
    }

    public static void main(String[] args) {

        String[][] items = new String[4][3];
        items[0][0] = "Ayam Bakar"; // nama item
        items[0][1] = "15000"; // harga
        items[0][2] = "40"; // stok
        items[1][0] = "Es Teh"; // nama item
        items[1][1] = "3000"; // harga
        items[1][2] = "50"; // stok
        items[2][0] = "Es Jeruk"; // nama item
        items[2][1] = "4000"; // harga
        items[2][2] = "50"; // stok
        items[3][0] = "Es Anggur"; // nama item
        items[3][1] = "5000"; // harga
        items[3][2] = "50"; // stok

        while (session == true) {

            stock(items);
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();

            if (pilihan == 20) {
                sc.close();
                break;
            } else {
                AddStock(items, pilihan);
                continue;
            }
        }
    }
}
