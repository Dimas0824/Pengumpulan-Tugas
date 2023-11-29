public class Fibonancci20 {

    // Fungsi rekursif untuk menghitung jumlah pasangan marmut
    public static int hitungMarmut(int bulan) {
        if (bulan <= 2) {
            return 1; // Pada dua bulan pertama, hanya ada satu pasangan
        } else {
            return hitungMarmut(bulan - 1) + hitungMarmut(bulan - 2);
        }
    }

    public static void main(String[] args) {
        int bulan = 12;
        int jumlahMarmut = hitungMarmut(bulan);
        System.out.println("Jumlah pasangan marmut pada akhir bulan ke-" + bulan + " adalah: " + jumlahMarmut);
    }
}
