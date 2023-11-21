package com.example.tugas_2;

import java.util.Scanner;

public class tugas_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Langkah 2: Masukkan Bilangan
        System.out.print("Masukkan bilangan bulat positif: ");
        int bilangan = scanner.nextInt();

        // Langkah 3: Periksa Keluaran
        if (bilangan < 0) {
            System.out.println("Error: Bilangan harus positif. Program dihentikan.");
        } else if (bilangan == 0) {
            System.out.println("Bilangan 0 adalah bilangan genap.");
        } else {
            // Langkah 4: Periksa Ganjil atau Genap
            if (bilangan % 2 == 0) {
                System.out.println("Bilangan " + bilangan + " adalah bilangan genap.");
            } else {
                System.out.println("Bilangan " + bilangan + " adalah bilangan ganjil.");
            }
        }

        // Langkah 5: Selesai
        scanner.close();
    }
}

