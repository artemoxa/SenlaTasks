package com.artemoxa;

import java.util.Scanner;

public class Task1 {

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }

    static void printPrimes(int max) {
        System.out.println("Список простых чисел от 1 до "+max+":");
        for (int i = 2; i <= max; i++) {
            if (isPrime(i))
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите N: ");
        int max = in.nextInt();
        printPrimes(max);
    }
}
