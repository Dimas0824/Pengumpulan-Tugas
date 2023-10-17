import java.util.Scanner;

class Pertanyaan {
    String pertanyaan;
    String jawaban;

    Pertanyaan(String pertanyaan, String jawaban) {
        this.pertanyaan = pertanyaan;
        this.jawaban = jawaban;
    }
    boolean cekJawaban(String jawabanPengguna) {
        return this.jawaban.equalsIgnoreCase(jawabanPengguna);
    }
}
public class tesUjian {
    public static void main(String[] args) {
        Pertanyaan[] kuis = new Pertanyaan[] {
            new Pertanyaan("Apa ibukota Indonesia?", "Jakarta"),
            new Pertanyaan("Siapa presiden Indonesia pertama?", "Soekarno"),
            new Pertanyaan("Apa mata uang Indonesia?", "Rupiah")
        };

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < kuis.length; i++) {
            System.out.println(kuis[i].pertanyaan);
            String jawabanPengguna = scanner.nextLine();

            if (kuis[i].cekJawaban(jawabanPengguna)) {
                System.out.println("Jawaban Anda benar!");
            } else {
                System.out.println("Maaf, jawaban Anda salah. Jawaban yang benar adalah " + kuis[i].jawaban + ".");
            }
        }

        scanner.close();
    }
}