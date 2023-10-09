import java.util.Scanner;

public class WhileKelipatan20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan kelipatan (1-9): ");
        int kelipatan = input.nextInt();
        int total = 0;
        int counter = 0;
        double rata = 0;

        int i = 1;
        while (i <= 50) {
            if (i % kelipatan == 0) {
                total += i;
                counter++;
                rata = total / counter;
            }
            i++;
        }

        System.out.println("Banyaknya bilangan " + kelipatan + " dari 1 sampai 50 adalah " + counter);
        System.out.println("Total bilangan kelipatan " + kelipatan + " adalah " + total);
        System.out.println("Rata-rata bilangan kelipatan " + kelipatan + " adalah " + rata);
    }
}
