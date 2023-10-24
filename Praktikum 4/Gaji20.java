import java.util.Scanner;

public class Gaji20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jmlMasuk, jmlTdkMasuk, TotGaji;

        System.out.print("Masukkan gaji: ");
        int gaji = input.nextInt();
        System.out.print("Masukkan potongan gaji: ");
        int potGaji = input.nextInt();
        System.out.print("Masukkan jumlah masuk: ");
        jmlMasuk = input.nextInt();
        System.out.print("Masukkan jumlah tidak masuk: ");
        jmlTdkMasuk = input.nextInt();
        TotGaji = (jmlMasuk * gaji) - (jmlTdkMasuk * potGaji);
        System.out.println("Gaji yang anda terima adalah: " + TotGaji);
    }
}