public class Percobaan120 {
    static int faktorialRekrusif(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * faktorialRekrusif(n - 1);
        }
    }

    static int faktorialIteratif(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(faktorialRekrusif(5));
        System.out.println(faktorialIteratif(5));
    }
}
