import java.util.Scanner;

public class fiturMembership {

    public static void main(String[] args) {

        String kode = "2341", inputKode;
        int total, diskon;

        Scanner input14 = new Scanner(System.in);

        System.out.print("Masukkan kode membership : ");
        inputKode = input14.nextLine();

        System.out.print("Masukkan total : ");
        total = input14.nextInt();

        if (kode.equals(inputKode)) {

            if (total >= 100000) {
                diskon = 20000;
                total -= diskon;
            } else {
                diskon = 10000;
                total -= diskon;
            }
        }

        System.out.println();
        System.out.println("Total belanja : " + total);
        input14.close();
    }
}