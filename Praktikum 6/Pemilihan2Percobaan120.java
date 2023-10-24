import java.util.Scanner;

public class Pemilihan2Percobaan120 {
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);

        System.out.println("======= Cek Kabisat =========");
        System.out.print("Masukkan Tahun: ");
        int tahun = input20.nextInt();

        // if condition
        if (tahun % 4 == 0) {
            System.out.println(tahun + " adalah tahun kabisat");
        } else {
            System.out.println(tahun + " bukan tahun kabisat");
        }
    }
}