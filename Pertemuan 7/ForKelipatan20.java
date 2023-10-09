import java.util.Scanner;

public class ForKelipatan20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan kelipatan (1-9): ");
        int kelipatan = input.nextInt();
        int total = 0;
        int counter = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                total += i;
                counter++;
            }
        }

        System.out.println("Banyaknya bilangan " + kelipatan + " dari 1 sampai 50 adalah " + counter);
        System.out.println("Total bilangan kelipatan " + kelipatan + " adalah " + total);
    }
}