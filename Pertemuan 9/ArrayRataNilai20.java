import java.util.Scanner;

public class ArrayRataNilai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMahasiswa];
        double total = 0;
        double rata2;
        int jumlahLulus = 0;
        double totalTidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                jumlahLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
            }
        }

        rata2 = total / nilaiMhs.length;
        System.out.println("Rata-rata nilai = " + rata2);
        System.out.println("Rata-rata nilai tidak lulus = " + (totalTidakLulus / (nilaiMhs.length - jumlahLulus)));
    }
}
