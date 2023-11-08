package ProjectSemester;

/**
 * Tugas_History
 */
public class Tugas_History {

    public static void main(String[] args) {

        String pemesanan[][] = new String[20][4];
        String detail_pemesanan[][] = new String[20][3];

        pemesanan[0][0] = "Aji";
        pemesanan[0][1] = "100000";
        pemesanan[0][2] = "20000";
        pemesanan[0][3] = "80000";

        pemesanan[1][0] = "Adi";
        pemesanan[1][1] = "120000";
        pemesanan[1][2] = "20000";
        pemesanan[1][3] = "100000";

        detail_pemesanan[0][0] = "0";
        detail_pemesanan[0][1] = "Ayam";
        detail_pemesanan[0][2] = "15000";

        detail_pemesanan[1][0] = "1";
        detail_pemesanan[1][1] = "Ayam";
        detail_pemesanan[1][2] = "15000";

        detail_pemesanan[2][0] = "1";
        detail_pemesanan[2][1] = "Teh";
        detail_pemesanan[2][2] = "3000";

        for (int i = 0; i < pemesanan.length; i++) {
            if (pemesanan[i][0] != null) {
                System.out.println("Pemesanan ke-" + (i + 1));
                System.out.println("Nama pembeli : " + pemesanan[i][0]);
                System.out.println("Harga awal   : " + pemesanan[i][1]);
                System.out.println("Harga Diskon : " + pemesanan[i][2]);
                System.out.println("Harga Total  : " + pemesanan[i][3]);
                System.out.println("Daftar pemesanan : ");
            }

            for (int j = 0; j < detail_pemesanan.length; j++) {
                if (detail_pemesanan[j][0] != null && Integer.parseInt(detail_pemesanan[j][0]) == i) {
                    System.out.println("> " + detail_pemesanan[j][1] + " -- " + detail_pemesanan[0][2]);
                }
            }
            if (pemesanan[i][0] != null) {
                System.out.println();
            }
        }
    }
}