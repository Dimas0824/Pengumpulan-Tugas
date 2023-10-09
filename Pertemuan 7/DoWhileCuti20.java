import java.util.Scanner;

public class DoWhileCuti20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // deklarasi
        int jatahCuti, jumlahHari;
        String konfirmasi;

        //main
        System.out.print("Jatah cuti: ");
        jatahCuti = sc.nextInt();

        do {
            System.out.print("Apakah Anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.next();
            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = sc.nextInt();

                while (jumlahHari > jatahCuti) {
                    System.out.println("Sisa jatah cuti Anda tidak mencukupi");
                    System.out.print("Jumlah hari: ");
                    jumlahHari = sc.nextInt();
                }
                jatahCuti -= jumlahHari;
                System.out.println("Sisa jatah cuti: " + jatahCuti);
            }
        } while (jatahCuti > 0 && !konfirmasi.equalsIgnoreCase("t"));
    }
}
