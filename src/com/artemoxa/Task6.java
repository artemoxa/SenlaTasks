package com.artemoxa;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите текст: ");
        System.out.println(in.nextLine().replaceAll("\\d",""));
    }
}
