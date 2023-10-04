import java.util.Scanner;

public class Latihan220 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); // input scanner

        // deklarasi input
        String username = "Dimas24";
        String password = "Dimas08";
        boolean token = false;

        //login page

        while (true) {
            while (!token) {
                System.out.println("||--silahkan Login--||");
                System.out.print("Masukkan Username : ");
                String inputUsername = sc.nextLine();
                System.out.print("Masukkan Password : ");
                String inputPassword = sc.nextLine();

                //cek login
                if (username.equals(inputUsername) && password.equals(inputPassword)) {
                    token = true;
                    System.out.println("Login sukses!");
                    System.out.print("Selamat datang " + inputUsername );
                    System.out.println();

                } else if (username.equals(inputUsername) == false && password.equals(inputPassword) == false) {
                    System.out.println("Username dan Password salah!");

                } else if (username.equals(inputUsername) == false) {
                    System.out.println("Username salah!");

                } else if (password.equals(inputPassword) == false) {
                    System.out.println("Password salah!");

                }
            }
        }
    }
}