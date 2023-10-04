import java.util.Scanner;

public class LatIndividu20 {
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
                    System.out.println();

                } else if (username.equals(inputUsername) == false && password.equals(inputPassword) == false) {
                    System.out.println("Username dan Password salah!");

                } else if (username.equals(inputUsername) == false) {
                    System.out.println("Username salah!");

                } else if (password.equals(inputPassword) == false) {
                    System.out.println("Password salah!");

                }
            }
            //switch case
            System.out.println("Menu:");
            System.out.println("1. Buat Akun Baru");
            System.out.println("2. Lihat Data Diri");
            System.out.println("3. Ubah Username dan Password");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilih = sc.nextInt();
            sc.nextLine(); // Consume newline left-over

            switch (pilih) {
                case 1:
                    // Buat Akun Baru
                    System.out.print("Masukkan Username Baru: ");
                    username = sc.nextLine();
                    System.out.print("Masukkan Password: ");
                    password = sc.nextLine();
                    break;
                case 2:
                    // Lihat Data Diri
                    System.out.println("Username: " + username);
                    System.out.println("Password: " + password);
                    break;
                case 3:
                    // Ubah Username dan Password
                    System.out.println("Masukkan Username Baru: ");
                    username = sc.nextLine();
                    System.out.println("Masukkan Password Baru: ");
                    password = sc.nextLine();
                    break;
                case 4:
                    // Keluar
                    System.out.println("Keluar dari aplikasi");
                    System.exit(0);
                default:
                    System.out.println("Menu tidak valid");
            }
        }
    }
}
