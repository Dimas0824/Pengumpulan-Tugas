import java.util.Scanner;

public class LatihanIndividu220 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); // input scanner

        // deklarasi input
        String username = "Dimas24";
        String password = "Dimas08";

        //login page
        System.out.println("||--silahkan Login--||");
        System.out.print("Masukkan Username : ");
        String inputUsername = sc.nextLine();
        System.out.print("Masukkan Password : ");
        String inputPassword = sc.nextLine();

        // cek login
        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Login Berhasil");
            System.out.println("Selamat Datang " + inputUsername);
        } else {
            System.out.println("Username dan Password Salah");
        }
        sc.close();
    }
}