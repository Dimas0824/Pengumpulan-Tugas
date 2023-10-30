package ProjectSemester;
import java.util.Scanner;

/**
 * Tugas_2_Login
 */
public class Tugas_2_Login {

    public static void main(String[] args) {

        // deklarasi dan inisialisasi scanner, variable, dan array
        Scanner sc = new Scanner(System.in);

        String[] username = { "haikal", "irsyad", "esa" };
        String[] password = { "123", "456", "789" };
        String inputUS, inputPW;
        int id = 0;
        boolean access = false;

        // looping login
        do {

            // input username
            System.out.println("Silahkan Login!");
            System.out.print("Masukkan username : ");
            inputUS = sc.nextLine();

            // input password
            System.out.print("Masukkan password : ");
            inputPW = sc.nextLine();

            // looping search username dan password
            for (int i = 0; i < username.length; i++) {
                // jika true, maka id bernilai index dan access bernilai true
                if (inputUS.equals(username[i]) && inputPW.equals(password[i])) {
                    System.out.println();
                    System.out.println("Login berhasil!");
                    id = i;
                    access = true;
                    break;
                }
            }

            // jika belum berhasil login maka akan ditampilkan kode dibawah
            if (access != true) {
                System.out.println("Username dan Password salah!");
                System.out.println();
            }

            // jika access masuh bernilai not true, maka looping akan mengulang lagi
        } while (access != true);

        // output berhasil login
        System.out.println("Selamat datang " + username[id] + "!");
        sc.close();
    }
}