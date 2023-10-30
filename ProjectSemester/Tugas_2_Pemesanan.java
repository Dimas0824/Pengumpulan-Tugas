package ProjectSemester;
import java.util.Scanner;

public class Tugas_2_Pemesanan {

    public static void main(String[] args) {

        // deklarasi dan inisialisasi scanner, variable, dan array
        Scanner sc = new Scanner(System.in);

        int itemCount = 0;
        String[] pesanan = new String[40];
        String inputPesanan;
        char choice;
        boolean session = true;

        System.out.println("Cafe The Orange!");

        // looping input pesanan
        for (int i = 0; session == true; i++) {
            System.out.print("Masukkan pesanan ke-" + (i + 1) + " mu : ");
            inputPesanan = sc.nextLine();
            pesanan[i] = inputPesanan;
            itemCount++;

            // konfirmasi menambahkan menu
            System.out.print("Apakah anda ingin memesan lagi? (y/t) : ");
            choice = sc.next().charAt(0);
            sc.nextLine();
            System.out.println();

            // jika y atau Y maka akan melanjutkan looping
            if (choice == 'y' || choice == 'Y') {
                continue;

                // jika selain y maka session menjadi false
            } else {
                session = false;
            }
        }

        // looping output pesanan satu persatu
        System.out.println("Pesanan anda : ");
        for (int i = 0; i < itemCount; i++) {
            System.out.println("> " + pesanan[i]);
        }

        sc.close();
    }
}
