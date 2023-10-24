import java.util.Scanner;

public class Lingkaran20 {
    public static void main(String[] args) {
        int r;
        double keliling, luas ;
        double phi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari lingkaran: ");
        r = input.nextInt();
        keliling = 2 * phi * r;
        luas = phi * r * r;
        System.out.println(keliling);
        System.out.println(luas);
    }
}