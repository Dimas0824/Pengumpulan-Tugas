import java.util.Scanner;

public class ForKelipatan20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan kelipatan (1-9): ");
        int kelipatan = input.nextInt();
        int total = 0;
        int counter = 0;
        double rata = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                total += i;
                counter++;
                rata = total / counter;
            }
        }

        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter); 
        System.out.printf("total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total); 
        System.out.printf("rata-rata bilangan kelipatan %d dari 1 sampai 50 adalah %2f\n", kelipatan, rata);
    }
}