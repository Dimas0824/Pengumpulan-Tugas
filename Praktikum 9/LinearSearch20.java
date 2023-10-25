import java.util.Scanner;

public class LinearSearch20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jumlahElemen = sc.nextInt();

        int [] arrayInt = new int [jumlahElemen];
        int key= 0;
        int hasil=0; 

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen ke-" + i + ": ");
            arrayInt[i] = sc.nextInt();
        }
        
        System.out.println("Masukkan key: ");
        key = sc.nextInt();
        
        for(int i = 0; i <arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }else{
                System.out.print("Key tidak ada dalam array");
                System.exit(0);
            }
        }
        System.out.println("Key ada dalam array pada posisi indeks ke-" + hasil);
    }
}
