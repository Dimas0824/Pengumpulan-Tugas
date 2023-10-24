import java.util.Scanner;

public class laundry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] kategori = {"Cuci Kering", "Cuci Setrika", "Setrika"};
        int[] biaya = {3000, 5000, 4000};
        
        System.out.println("Selamat datang di Laundry dimas!");
        
        System.out.println("Kategori:");
        for (int i = 0; i < kategori.length; i++) {
            System.out.println((i + 1) + ". " + kategori[i]);
        }
        
        System.out.print("Pilih kategori laundry (1-" + kategori.length + "): ");
        int choice = sc.nextInt();
        
        if (choice >= 1 && choice <= kategori.length) {
            System.out.print("Masukkan berat laundry (kg): ");
            double weight = sc.nextDouble();
            
            double total = biaya[choice - 1] * weight;
            
            System.out.println("Biaya yang harus dibayar: Rp " + total);
        } else{
            System.out.println("Pilihan tidak valid.");
        }
        
        System.out.println("Terima kasih telah menggunakan Laundry Program!");
    }
}