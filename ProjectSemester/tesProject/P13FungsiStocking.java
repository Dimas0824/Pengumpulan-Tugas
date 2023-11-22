package ProjectSemester.tesProject;

import java.util.Scanner;

public class P13FungsiStocking {

    static void stock() {
        String[][] items = new String[20][4];
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

        System.out.println();
        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║              Cafe the orange stok            ║");
        System.out.println("╚══════════════════════════════════════════════╝");
        System.out.println();
        int count = 1;
        for (int i = 0; i < items.length; i++) {
            if (items[i][0] != null) {
                System.out.println("[" + (count++) + "] tambah stok " + items[i][0] + " (" + items[i][2] + ")");
                System.out.println("[" + (count++) + "] kurangi stok " + items[i][0] + " (" + items[i][2] + ")");
            }
        }
        System.out.println("[" + (count + 1) + "] untuk mencari stok menu");
        System.out.println("[" + 20 + "] to exit");
    }

    public static void main(String[] args) {
        int pilihan;
        Scanner sc = new Scanner(System.in);

        stock();
        System.out.print("Pilihan: ");
        pilihan = sc.nextInt();

    }
}
