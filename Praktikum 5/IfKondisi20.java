import java.util.Scanner;

public class IfKondisi20 {
    public static void main(String[] args) {
        Scanner sc20= new Scanner(System.in);

        System.out.print("Masukkan suhu: ");
        int suhu = sc20.nextInt();

        if (suhu < 16) {
            System.out.println("silahkan menggunakan jaket");
        }
        if (suhu < 20) {
            System.out.println("silahkan pakai baju tebal");
        }
        else{
            System.out.println("silahkan pakai celana panjang");
        }
    }
    
}