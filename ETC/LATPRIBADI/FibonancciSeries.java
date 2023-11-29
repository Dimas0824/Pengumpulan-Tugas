package LATPRIBADI;

import java.util.Scanner;

public class FibonancciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka dalam deret Fibonacci: ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("Mohon masukkan bilangan bulat positif.");
        } else {
            System.out.print("Deret Fibonacci: ");
            for (int i = 1; i <= N; i++) {
                System.out.print(cetakDeretFibonacci(i) + ", ");
            }
        }
    }

    public static int cetakDeretFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return cetakDeretFibonacci(n - 1) + cetakDeretFibonacci(n - 2);
        }
    }
}