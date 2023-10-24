import java.util.Scanner;

public class LatihanMandiriA20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, jenisKelamin;

        for (int i = 1; i <= 30; i++) {
            System.out.print("Masukkan nama: ");
            nama = input.nextLine();
            System.out.print("Pilih jenis kelamin (L/P): ");
            jenisKelamin = input.nextLine();

            if (jenisKelamin.equalsIgnoreCase("P")) {
                System.out.println(nama);
            }else if (jenisKelamin.equalsIgnoreCase("L")) {
            }
        }
    }
}