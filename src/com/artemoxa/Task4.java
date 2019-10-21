package com.artemoxa;

import java.util.Scanner;

public class Task4 {

    private static int nod(int a, int b) {

        if (a == 0)
            return b;
        if (b == 0)
            return a;
        if (a == b)
            return a;

        return nod(b, a % b);
        }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число A: ");
        int A = in.nextInt();
        System.out.print("Введите число B: ");
        int B = in.nextInt();
        int nodAB = nod(A,B);
        System.out.println("НОД: "+nodAB);
        System.out.println("НОК: "+A*B/nodAB);
    }
    }


