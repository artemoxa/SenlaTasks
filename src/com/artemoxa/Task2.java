package com.artemoxa;

import java.util.Scanner;

public class Task2 {

    static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }

    static void printFibs(int max){
        System.out.println("Список чисел Фибоначчи от 1 до "+max+":");
        for (int i = 1;;i++) {
            int num = fib(i);
            if (num > max)
                break;
            System.out.print(num+" ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите N: ");
        int max = in.nextInt();
        printFibs(max);
    }
}
