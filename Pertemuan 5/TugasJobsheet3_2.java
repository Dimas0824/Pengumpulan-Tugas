import java.util.Scanner;

public class TugasJobsheet3_2 {

    public static void main(String[] args) {

        int stokAyamBakar = 40;
        int stokAyamGoreng = 45;
        int stokEsTeh = 50;
        int stokKopi = 55;
        boolean token = false;
        String username = "admin";
        String password = "admin123";

        Scanner sc = new Scanner(System.in);

        while (true) {

            //  Fitur Login if-else
            while (token != true) {

                System.out.println();
                System.out.println("LOGIN DULU!");
                System.out.print("Masukkan username : ");
                String inputUsername = sc.nextLine();
                System.out.print("Masukkan password : ");
                String inputPassword = sc.nextLine();

                if (inputUsername.equals(username) && inputPassword.equals(password)) {
                    token = true;
                    System.out.println("Login sukses!");
                    System.out.println();

                } else if (inputUsername.equals(username) == false && inputPassword.equals(password) == false) {
                    System.out.println("Username dan Password salah!");

                } else if (inputUsername.equals(username) == false) {
                    System.out.println("Username salah!");

                } else if (inputPassword.equals(password) == false) {
                    System.out.println("Password salah!");

                }
            }

            //  Fitur Tambah Stok
            System.out.println("Cafe The Orange Stok!");
            System.out.println("Pilih 1 untuk tambah stok Ayam Bakar (" + stokAyamBakar + ")");
            System.out.println("Pilih 2 untuk tambah stok Ayam Goreng (" + stokAyamGoreng + ")");
            System.out.println("Pilih 3 untuk tambah stok Es Teh (" + stokEsTeh + ")");
            System.out.println("Pilih 4 untuk tambah stok Kopi (" + stokKopi + ")");
            System.out.println("Pilih 5 untuk selesai");
            System.out.println("");
            System.out.print("Pilihan : ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Tambah stok Ayam Bakar : ");
                    int inputAyamBakar = sc.nextInt();
                    stokAyamBakar = stokAyamBakar + inputAyamBakar;
                    break;

                case 2:
                    System.out.print("Tambah stok Ayam Goreng : ");
                    int inputAyamGoreng = sc.nextInt();
                    stokAyamGoreng = stokAyamGoreng + inputAyamGoreng;
                    break;

                case 3:
                    System.out.print("Tambah stok Es Teh : ");
                    int inputEsTeh = sc.nextInt();
                    stokEsTeh = stokEsTeh + inputEsTeh;
                    break;

                case 4:
                    System.out.print("Tambah stok Kopi : ");
                    int inputKopi = sc.nextInt();
                    stokKopi = stokKopi + inputKopi;
                    break;

                case 5:
                    System.out.println("Thank you!");
                    sc.close();
                    System.exit(0);
                    break;
            }
        }
    }
}
