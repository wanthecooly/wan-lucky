package com.example.tugas_2;

import java.util.Scanner;
public class JustSwitchIT {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Which verse?");
        int verse = keyboard.nextInt();

        switch (verse) {
            case 1:
                System.out.println("thst's because he has no brian.");
                break;
            case 2:
                System.out.println("thst's because he is a pain.");
                break;
            case 3:
                System.out.println("'cause this is the last refrain.");
            default:
                System.out.println("No such verse. Please try again.");
                break;
        }
        System.out.println("ohhhhhhh.....");

        keyboard.close();
    }
}


