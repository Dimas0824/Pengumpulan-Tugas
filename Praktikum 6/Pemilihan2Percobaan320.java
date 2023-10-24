import java.util.Scanner;

public class Pemilihan2Percobaan320 {
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);
        
        //deklarasi
        String kategori;
        int penghasilan, gajiBersih;
        double pajak=0;

        //main
        System.out.print("Masukkan kategori: ");
        kategori = input20.nextLine();
        System.out.print("Masukkan besarnya penghasilan: ");
        penghasilan = input20.nextInt();

        // if 
        if(kategori.equalsIgnoreCase("pekerja")){
            if (penghasilan <= 2000000)
            pajak = 0.1;
            else if (penghasilan <= 3000000)
            pajak = 0.15;
            else
            pajak = 0.2;
            gajiBersih = (int) (penghasilan - (penghasilan * pajak));
            System.out.println("Penghasilan bersih: " + gajiBersih);
        }else if(kategori.equalsIgnoreCase("Pebisnis")) {
            if (penghasilan <= 2500000)
            pajak =0.15;
            else if (penghasilan <= 3500000)
            pajak = 0.2;
            else
            pajak = 0.25;
            gajiBersih = (int) (penghasilan - (penghasilan * pajak));
            System.out.println("Penghasilan bersih: " + gajiBersih);
        }else{
            System.out.println("Masukan Kategori Salah");
        }
    }
}