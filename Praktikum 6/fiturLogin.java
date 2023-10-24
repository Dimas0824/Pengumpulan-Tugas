import java.util.Scanner;

public class fiturLogin {

    public static void main(String[] args) {

        String username = "admin", password = "123", inputUsername, inputPassword;

        Scanner input14 = new Scanner(System.in);

        System.out.print("Masukkan username anda : ");
        inputUsername = input14.nextLine();

        System.out.print("Masukkan password anda : ");
        inputPassword = input14.nextLine();

        if (inputUsername.equals(username)) {
            if (inputPassword.equals(password)) {
                System.out.println("Login berhasil!");
                System.out.println("Selamat datang " + username + "!");
            } else {
                System.out.println("Login gagal, username dan password salah!");
            }
        } else {
            System.out.println("Login gagal, username dan password salah!");
        }

        input14.close();
    }
}