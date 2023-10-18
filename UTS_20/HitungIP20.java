package UTS_20;
import java.util.Scanner;

public class HitungIP20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menampilkan pesan awal program
        System.out.println("Program Hitung IP");
        System.out.print("Masukkan nama: ");
        String namaMahasiswa = scanner.nextLine();

        // Inisialisasi variabel
        int jumlahMataKuliah = 0;
        double totalSKS = 0;
        double totalNilai = 0;
        int jumlahPerbaikan = 0;

        String lanjutInputNilai = "y";

        // Loop untuk memasukkan nilai
        while (lanjutInputNilai.equalsIgnoreCase("y")) {
            System.out.print("Nama Mata Kuliah: ");
            String namaMataKuliah = scanner.nextLine();

            System.out.print("Nilai (A, B+, B, C+, C, D, E): ");
            String indeksNilai = scanner.nextLine();

            System.out.print("Masukkan jumlah SKS: ");
            int sks = scanner.nextInt();

            scanner.nextLine(); 

            jumlahMataKuliah++;
            totalSKS += sks;

            // Konversi indeks nilai ke angka
            double nilai;
            switch (indeksNilai.toUpperCase()) {
                case "A":
                    nilai = 4.0;
                    break;
                case "B+":
                    nilai = 3.5;
                    break;
                case "B":
                    nilai = 3.0;
                    break;
                case "C+":
                    nilai = 2.5;
                    break;
                case "C":
                    nilai = 2.0;
                    break;
                case "D":
                    nilai = 1.0;
                    jumlahPerbaikan++;
                    break;
                case "E":
                    nilai = 0.0;
                    jumlahPerbaikan++;
                    break;
                default:
                    nilai = 0.0;
                    break;
            }

            totalNilai += nilai * sks;

            // Menampilkan pesan ingin memasukkan nilai lagi
            System.out.print("Apakah lanjut input nilai (Y/N)? ");
            lanjutInputNilai = scanner.nextLine();
        }

        // Hitung IP
        double ip = totalNilai / totalSKS;
        double ipBulat = Math.round(ip * 100) / 100.0;

        // Tampilkan hasil perhitungan IP
        System.out.println("\n-------- Hasil Perhitungan IP --------");
        System.out.println("Nama\t\t\t: " + namaMahasiswa);
        System.out.println("Indeks Prestasi (IP)\t: " + ipBulat);
        System.out.println("Jumlah mata kuliah\t: " + jumlahMataKuliah);
        System.out.println("Jumlah SKS\t\t: " + totalSKS);
        System.out.println("Jumlah mata kuliah yang harus perbaikan/remidi: " + jumlahPerbaikan);
    }
}
