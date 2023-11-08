package ProjectSemester;

import java.util.Scanner;

public class Tugas_2_Login {

    public static void main(String[] args) {

        // deklarasi dan inisialisasi scanner, variable, dan array
        Scanner sc = new Scanner(System.in);

        String[][] users = { { "haikal", "123" }, { "irsyad", "456" }, { "esa", "789" } };
        String inputUS, inputPW;
        int id = -1;

        // looping login
        do {
            System.out.println("Silahkan Login!");

            // input username
            System.out.print("Masukkan username : ");
            inputUS = sc.nextLine();

            // input password
            System.out.print("Masukkan password : ");
            inputPW = sc.nextLine();

            // looping search username dan password
            for (int i = 0; i < users.length; i++) {
                if (inputUS.equals(users[i][0])) {
                    for (int j = 0; j < users[i].length; j++) {
                        if (inputPW.equals(users[i][j])) {
                            System.out.println();
                            System.out.println("Login berhasil!");
                            id = i;
                            break;
                        }
                    }
                }
                if (id != -1) {
                    break;
                }
            }

            // jika belum berhasil login maka akan ditampilkan kode dibawah
            if (id == -1) {
                System.out.println("Username dan Password salah!");
                System.out.println();
            }

        } while (id == -1);

        // output berhasil login
        System.out.println("Selamat datang " + users[id][0] + "!");
        sc.close();
    }
}
