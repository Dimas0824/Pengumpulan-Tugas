import java.util.Scanner;

public class UcapanTerimaKasih_20 {
    public static void UcapanTerimaKasih(String nama) {
        System.out.println("Thank you " + nama + " for being the best teacher in the world. \n" +
                "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }

    public static void UcapanTambahan(String ucapan) {
        System.out.println(ucapan);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tuliskan NAMA orang yang ingin Anda beri ucapan: ");
        String penerima = sc.nextLine();
        UcapanTerimaKasih(penerima);

        System.out.print("Tuliskan UCAPAN TAMBAHAN yang ingin Anda sampaikan: ");
        String ucapan = sc.nextLine();
        UcapanTambahan(ucapan + " " + penerima);

        sc.close();
    }
}
