import java.util.Scanner;

public class Pemilihan2Percobaan220 {
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);

        //deklarasi
        double totalSudut;

        //main
        System.out.print("Masukkan sudut 1: ");
        double sudut1 = input20.nextDouble();
        System.out.print("Masukkan sudut 2: ");
        double sudut2 = input20.nextDouble();
        System.out.print("Masukkan sudut 3: ");
        double sudut3 = input20.nextDouble();

        totalSudut = sudut1 + sudut2 + sudut3;

        //if
        if (totalSudut == 180) {
            if ((sudut1 == 90 || sudut2 == 90 || sudut3 == 90)) {
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            } else {
                System.out.println("Segitiga tersebut adalah bukan segitiga siku-siku");
            }
        }else{
            System.out.println("Bukan Segitiga");
        }

    }
}