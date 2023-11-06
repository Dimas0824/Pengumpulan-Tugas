import java.util.Scanner;

public class NestedLoop20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] temps = new int[2][2];
        double[] rata = new double[2];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i + 1));
            int total = 0;
            for (int j = 0; j < temps[i].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = sc.nextInt();
                total += temps[i][j];
            }
            rata[i] = (double) total / temps[i].length;
            System.out.println();
        }

        int kota = 1;
        for (int[] temp : temps) {
            System.out.print("Kota ke-" + kota + ": ");
            for (int hari : temp) {
                System.out.print(hari + " ");
            }
            System.out.println();
            System.out.println("Rata-rata suhu di Kota ke-" + kota + " adalah " + rata[kota - 1]);
            kota++;
        }
    }
}
