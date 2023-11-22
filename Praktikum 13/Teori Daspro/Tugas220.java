import java.util.Scanner;

public class Tugas220 {
    static final int JUMLAH_MAHASISWA = 5;
    static final int JUMLAH_HARI = 7;

    public static void main(String[] args) {
        int[][] nilaiMahasiswa = new int[JUMLAH_MAHASISWA][JUMLAH_HARI];
        String[] namaMahasiswa = new String[JUMLAH_MAHASISWA];

        inputDataNilaiMahasiswa(namaMahasiswa, nilaiMahasiswa);
        tampilkanNilaiMahasiswa(namaMahasiswa, nilaiMahasiswa);
        cariHariNilaiTertinggi(nilaiMahasiswa);
        tampilkanMahasiswaNilaiTertinggi(namaMahasiswa, nilaiMahasiswa);
    }

    // Fungsi untuk meninputkan data nilai mahasiswa
    static void inputDataNilaiMahasiswa(String[] namaMahasiswa, int[][] nilaiMahasiswa) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
            System.out.print("Masukkan nama Mahasiswa " + (i + 1) + ": ");
            namaMahasiswa[i] = scanner.nextLine();

            System.out.println("Input nilai untuk " + namaMahasiswa[i] + ":");
            for (int j = 0; j < JUMLAH_HARI; j++) {
                System.out.print("Nilai minggu ke-" + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = scanner.nextInt();
            }
            scanner.nextLine(); // consume the newline character
        }
    }

    // Fungsi untuk menampilkan seluruh nilai mahasiswa mulai dari minggu pertama
    // sampai ketujuh
    static void tampilkanNilaiMahasiswa(String[] namaMahasiswa, int[][] nilaiMahasiswa) {
        System.out.println("\nTabel Nilai Mahasiswa:");
        System.out.print("Mahasiswa\t");
        for (int j = 0; j < JUMLAH_HARI; j++) {
            System.out.print("Minggu " + (j + 1) + "\t");
        }
        System.out.println();

        for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
            System.out.print(namaMahasiswa[i] + "\t\t");
            for (int j = 0; j < JUMLAH_HARI; j++) {
                System.out.print(nilaiMahasiswa[i][j] + "\t\t");
            }
            System.out.println();
        }
    }

    // Fungsi untuk mencari pada hari keberapakah terdapat nilai tertinggi dibanding
    // hari lain dari keseluruhan mahasiswa
    static void cariHariNilaiTertinggi(int[][] nilaiMahasiswa) {
        int[] nilaiTertinggiPerHari = new int[JUMLAH_HARI];

        for (int j = 0; j < JUMLAH_HARI; j++) {
            int nilaiTertinggi = nilaiMahasiswa[0][j];
            for (int i = 1; i < JUMLAH_MAHASISWA; i++) {
                if (nilaiMahasiswa[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMahasiswa[i][j];
                }
            }
            nilaiTertinggiPerHari[j] = nilaiTertinggi;
        }

        System.out.println("\nNilai Tertinggi Per Hari:");
        for (int j = 0; j < JUMLAH_HARI; j++) {
            System.out.println("Minggu ke-" + (j + 1) + ": " + nilaiTertinggiPerHari[j]);
        }
    }

    // Fungsi untuk menampilkan mahasiswa yang memiliki nilai tertinggi (tampilkan
    // pula keterangan nilai dari minggu ke-)
    static void tampilkanMahasiswaNilaiTertinggi(String[] namaMahasiswa, int[][] nilaiMahasiswa) {
        for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
            int nilaiTertinggi = nilaiMahasiswa[i][0];
            int mingguTertinggi = 1;

            for (int j = 1; j < JUMLAH_HARI; j++) {
                if (nilaiMahasiswa[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMahasiswa[i][j];
                    mingguTertinggi = j + 1;
                }
            }

            System.out.println(namaMahasiswa[i] + " memiliki nilai tertinggi " +
                    "sebesar " + nilaiTertinggi + " pada minggu ke-" + mingguTertinggi);
        }
    }
}
