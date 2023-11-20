import java.util.Scanner;

public class Ucapan_20 {
    public static String penerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tuliskan NAMA orang yang ingin Anda beri ucapan: ");
        String penerima = sc.nextLine();
        sc.close();
        return penerima;
    }

    public static void main(String[] args) {
        String nama = penerimaUcapan();
        System.out.println("Thank you " + nama + "\nMay the force be with you.");
    }
}
