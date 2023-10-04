import java.util.Scanner;

public class Latihanmandiri20 {

    public static void main(String[] args) {
        //deklarasi
        String username = "coba2";
        String password = "cobi2";
        int menuChoice;
        boolean token = false;

        Scanner sc = new Scanner(System.in);
    
        //login
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

        //menu
        do {
            // Tampilkan menu
            System.out.println("\nMenu:");
            System.out.println("1. Tambah User Baru");
            System.out.println("2. Lihat Data User dan Password");
            System.out.println("3. Ganti User dan Pass");
            System.out.println("4. Exit");
            System.out.print("Pilih menu (1-4): ");
            menuChoice = sc.nextInt();

            // Bersihkan buffer
            sc.nextLine();

            switch (menuChoice) {
                case 1:
                    // Tambah User Baru
                    System.out.print("Masukkan username baru: ");
                    String newUsername = sc.nextLine();
                    System.out.print("Masukkan password baru: ");
                    String newPassword = sc.nextLine();
                    // Simpan data user baru
                    username = newUsername;
                    password = newPassword;
                    System.out.println("User baru berhasil ditambahkan!");
                    break;
                case 2:
                    // Lihat Data User dan Password
                    System.out.println("Username: " + username);
                    System.out.println("Password: " + password);
                    break;
                case 3:
                    // Ganti User dan Pass
                    System.out.print("Masukkan username baru: ");
                    String updatedUsername = sc.nextLine();
                    System.out.print("Masukkan password baru: ");
                    String updatedPassword = sc.nextLine();
                    // Update data user
                    username = updatedUsername;
                    password = updatedPassword;
                    System.out.println("Username dan password berhasil diubah!");
                    break;
                case 4:
                    // Exit
                    System.out.println("Thank you!");
                    sc.close();
                    System.exit(0);
                    break;            
    }
} while (menuChoice != 4);
}
    }
}
