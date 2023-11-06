import java.util.Scanner;

public class totalPembelian2Dimensi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // print welcome dan meminta input jumlah item
        System.out.println("Selamat datang di Cafe The Orange!");
        System.out.print("Masukkan jumlah item yang dibeli: ");
        int jumlahItem = scanner.nextInt();

        double totalPembelian = 0;
        int[][] itemDetail = new int[jumlahItem][2]; // Array multidimensional

        for (int i = 0; i < jumlahItem; i++) {
            System.out.print("Masukkan harga item ke-" + (i + 1) + " : ");
            itemDetail[i][0] = scanner.nextInt();

            System.out.print("Masukkan jumlah item ke-" + (i + 1) + " yang dibeli: ");
            itemDetail[i][1] = scanner.nextInt();
        }

        for (int i = 0; i < jumlahItem; i++) {
            totalPembelian += itemDetail[i][0] * itemDetail[i][1];
        }

        System.out.print("\nTotal Pembelian Anda: Rp" + totalPembelian);
    }
}
