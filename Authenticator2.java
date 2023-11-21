package com.example.tugas_2;
import java.util.Scanner;
public class Authenticator2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Username: ");
        String username = keyboard.nextLine();

        if (username.equals("brian")) {
            System.out.println("Password: ");
            String password = keyboard.nextLine();

            if (password.equals("swordfish")) {
                System.out.println("You're in.");
            } else {
                System.out.println("Incorrect password");
            }
        } else {
            System.out.println("Unknown user");
        }
        keyboard.close();
    }
}


