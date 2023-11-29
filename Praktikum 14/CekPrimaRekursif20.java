import java.util.Scanner;

public class CekPrimaRekursif20 {

    // Fungsi rekursif untuk mengecek bilangan prima
    public static boolean isPrima(int n, int i) {
        if (n < 2) {
            return false;
        }
        if (i == 1) {
            return true;
        } else {
            if (n % i == 0) {
                return false;
            } else {
                return isPrima(n, i - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        boolean hasil = isPrima(n, n - 1);
        if (hasil) {
            System.out.println(n + " adalah bilangan prima.");
        } else {
            System.out.println(n + " bukan bilangan prima.");
        }
    }
}
