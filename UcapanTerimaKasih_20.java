import java.util.Scanner;

public class UcapanTerimaKasih_20 {
    public static String penerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tuliskan NAMA orang yang ingin Anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static void UcapanTerimaKasih() {
        String nama = penerimaUcapan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world. \n" +
                "Your inspired in me a love for learning and made me feel like I could ask you anything");
    }
}
