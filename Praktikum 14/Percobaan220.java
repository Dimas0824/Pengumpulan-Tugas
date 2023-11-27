import java.util.Scanner;

public class Percobaan220 {
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * hitungPangkat(x, y - 1);
        }
    }

    public static void main(String[] args) {
        int bilangan, pangkat;
        Scanner sc = new Scanner(System.in);

        System.out.print("Bilangan yang dihitung: ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat yang dihitung: ");
        pangkat = sc.nextInt();
        System.out.print("Hasil perhitungan pangkat: ");
        for (int i = 1; i <= pangkat; i++) {
            if (i == pangkat) {
                System.out.print(bilangan);
            } else {
                System.out.print(bilangan + "x");
            }
        }
        System.out.println(" = " + hitungPangkat(bilangan, pangkat));
    }
}
