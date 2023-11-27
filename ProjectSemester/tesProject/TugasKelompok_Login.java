package ProjectSemester.tesProject;

import java.util.Scanner;

public class TugasKelompok_Login {

    static Scanner sc = new Scanner(System.in);
    static String users[][] = { { "admin1", "123" }, { "admin2", "456" }, { "admin3", "789" } };
    static boolean access = false;

    static boolean Login() {
        boolean access = false;
        // input username
        System.out.println("Silahkan Login!");
        System.out.print("Masukkan username : ");
        String inputUS = sc.nextLine();

        // input password
        System.out.print("Masukkan password : ");
        String inputPW = sc.nextLine();

        // looping search username dan password
        for (int i = 0; i < users.length; i++) {
            // jika true, maka id bernilai index dan access bernilai true
            if (inputUS.equals(users[i][0]) && inputPW.equals(users[i][1])) {
                System.out.println();
                System.out.println("Login berhasil!");
                access = true;
                return access;
            }
        }

        System.out.println("Username dan Password Salah!");
        System.out.println();
        return access;

    }

    public static void main(String[] args) {
        while (access != true) {
            access = Login();
        }
    }

}
