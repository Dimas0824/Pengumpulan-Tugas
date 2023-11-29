package LATPRIBADI;

import java.util.Scanner;

public class FibonancciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            printFibonacciSeries(N);
        }
    }

    public static void printFibonacciSeries(int N) {
        int first = 1, second = 1, hitung = 2;

        // Print the first two terms of the series
        System.out.print("Fibonacci Series: 1, 1");

        while (hitung < N) {
            int next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
            hitung++;
        }
    }
}
