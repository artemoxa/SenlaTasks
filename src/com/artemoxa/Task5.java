package com.artemoxa;

import java.util.Scanner;

public class Task5 {


    static Boolean checkPal(String word) {

       String reverse  = new StringBuffer(word).reverse().toString();
       return  word.equalsIgnoreCase(reverse);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = in.nextLine();
        if (checkPal(word))
            System.out.println("Введенное слово - палиндром");
        else
            System.out.println("Введенное слово не является палиндромом");
    }


}
