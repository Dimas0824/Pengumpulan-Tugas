public class pertanyaan3percobaan5 {
    public static void tampilkan(String[] nama, int[] angka) {
        for (String n : nama) {
            System.out.println(n);
        }

        for (int a : angka) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        tampilkan(new String[] { "Andi", "Budi", "Cici" }, new int[] { 10, 20, 30 });
    }
}
