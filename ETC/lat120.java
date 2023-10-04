import java.util.Scanner;

public class lat120 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis senjata: ");
        System.out.println("1. Melee weapon");
        System.out.println("2. Ranged weapon");
        System.out.println("3. EXIT");
        String jenisSenjata = scanner.nextLine();

        switch (Integer.parseInt(jenisSenjata)) {
            case 1:
                System.out.println("Pertarungan berlangsung dalam jarak < 5 meter");
                System.out.println("Gunakan Melee weapon");
                break;
            case 2:
                System.out.println("Pertarungan berlangsung dalam jarak > 5 meter dan < 1000 meter");
                System.out.println("Gunakan Ranged weapon");
                break;
            case 3:
                System.out.println("EXIT, THANK YOU");
                break;
        }

        if (jenisSenjata.equalsIgnoreCase("Melee")) {
            System.out.println("Pertarungan yang berlangsung dalam jarak < 5 meter");
            System.out.println("Gunakan Melee weapon");
        } else if (jenisSenjata.equalsIgnoreCase("Ranged")) {
            System.out.println("Pertarungan yang berlangsung dalam jarak diatas 5 meter hingga 1000 meter");
            System.out.println("Gunakan Ranged weapon");
        } 
    }
}

