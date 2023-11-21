package com.example.tugas_2;

import java.util.Objects;
import java.util.Scanner;

import static java.lang.System.in;

public class checkPassowrd {
    public static void main(String[] args) {
        System.out.print("What,s the password");

        Scanner keyboard = new Scanner(in);
        String password = keyboard.next();

        System.out.println("You typed >>" + password +"<<");
        System.out.println();

        if (Objects.equals(password, "swordfish")) {
            System.out.println("The word you typed is stored");
            System.out.println("in the same palce as the real");
            System.out.println("password. you must be a");
            System.out.println("Hacker.");
        } else {
            System.out.println("The word you typed is not");
            System.out.println("stored in the same place as");
            System.out.println("the real password, but that's");
            System.out.println("no big deal.");
        }
        System.out.println();

        if (password.equals("swordfish")) {
            System.out.println("The word you typed has the");
            System.out.println("same characters as the real");
            System.out.println("password. you can user our");
            System.out.println("Precious system.");
        } else {
            System.out.println("The word you typed doesn't");
            System.out.println("have characters as the real");
            System.out.println("the real password, you that's");
            System.out.println("use our precious system.");
        }
        keyboard.close();

    }
}


