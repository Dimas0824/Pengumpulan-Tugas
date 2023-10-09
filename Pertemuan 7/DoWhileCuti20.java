import java.util.Scanner;

public class DoWhileCuti20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // deklarasi
        int jatahCuti, jumlahHari;
        String konfirmasi;

        //main
        System.out.println("Jata cuti: ");
        jatahCuti = sc.nextInt();

        do{
            System.out.println("Apakah Anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.next();
            if(konfirmasi.equalsIgnoreCase("y")){
                System.out.println("Jumlah hari: ");
                jumlahHari = sc.nextInt();

                if(jumlahHari <= jatahCuti){
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                }else{
                    System.out.println("Sisa jatah cuti Anda tidak mencukupi");
                    break;
                }
            }
        }while (jatahCuti > 0);
    }
}
