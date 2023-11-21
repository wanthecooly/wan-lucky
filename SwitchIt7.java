package com.example.tugas_2;
import java.util.Scanner;
public class SwitchIt7 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Which verse (one, two, or three)? ");
        String verse = keyboard.next();

        switch (verse) {
            case "one":
                System.out.println("that's because he has no brian.");
                break;
            case "two":
                System.out.println("that's beacuse he is a pain.");
                break;
            case "three":
                System.out.println("'cause this is the last refrain.");
            default:
                System.out.println("no such verse. please try again");
                break;
        }
        System.out.println("ohhhhhhhh......");

        keyboard.close();
    }

}
