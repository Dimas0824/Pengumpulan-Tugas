import java.util.Scanner;

public class WhileGaji20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah karyawan: ");
        int jumlahKaryawan = input.nextInt();

        int i = 0;
        double totalGajiLembur = 0;
        int gajiLembur = 0;

        while (i < jumlahKaryawan) {
            System.out.println("pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan jabatan karyawan ke-: " + (i + 1) + ": ");
            String jabatan = input.next();
            System.out.print("Masukkan jam lembur: ");
            int jumlahJamLembur = input.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jumlahJamLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            } else {
                System.out.println("Jabatan tidak valid.");
                i--; //mengurangi jabatan yg tidak valid
                continue;
            }
            totalGajiLembur += gajiLembur;
        }
        System.out.println("Total gaji lembur: " + totalGajiLembur);
    }
}