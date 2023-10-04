import java.util.Scanner;

public class LatihanIndividu1_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jarak dalam meter: ");
        int jarak = input.nextInt();
        
        if (jarak <= 5) {
            System.out.println("Gunakan melee weapon untuk pertarungan jarak dekat!");
        } else if (jarak > 5 && jarak <= 1000) {
            System.out.println("Gunakan ranged weapon untuk pertarungan jarak jauh!");
        } else {
            System.out.println("Jarak diluar rentang melee weapon dan ranged weapon!");
        }
    }
}