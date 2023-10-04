import java.util.Scanner;

public class LatihanIndividu120 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jarak musuh (dalam meter): ");
        int jarakMusuh = scanner.nextInt();

        if (jarakMusuh <= 5) {
            System.out.println("Untuk Close Combat");
            System.out.println("Gunakan Melee weapon");
        } else if (jarakMusuh > 5 && jarakMusuh <= 1000) {
            System.out.println("Untuk Long Range Combat");
            System.out.println("Cetak Gunakan Ranged weapon");
        } else {
            System.out.println("Jarak musuh di luar jangkauan");
        }

        scanner.close();
    }
}
