package CalculatorApp;
import java.util.Scanner;

public class CalculatorApp {
    
    // Created by Muhammad Rasyid Murtadho
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Tampilkan nama pembuat aplikasi
        System.out.println("Aplikasi Penghitung Sederhana");
        System.out.println("Created by Muhammad Rasyid Murtadho");
        System.out.println("------------------------------");

        do {
            // Tampilkan menu utama
            System.out.println("Menu:");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 4) {
                // Minta pengguna memasukkan dua angka
                System.out.print("Masukkan angka pertama: ");
                double num1 = scanner.nextDouble();
                System.out.print("Masukkan angka kedua: ");
                double num2 = scanner.nextDouble();
                double result = 0;

                switch (choice) {
                    case 1 -> {
                        result = num1 + num2;
                        System.out.println("Hasil Penjumlahan: " + result);
                    }
                    case 2 -> {
                        result = num1 - num2;
                        System.out.println("Hasil Pengurangan: " + result);
                    }
                    case 3 -> {
                        result = num1 * num2;
                        System.out.println("Hasil Perkalian: " + result);
                    }
                    case 4 -> {
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.println("Hasil Pembagian: " + result);
                        } else {
                            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                        }
                    }
                }

                // Pastikan result selalu dicetak di luar switch-case
                System.out.println("Hasil: " + result);

            } else if (choice != 5) {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (choice != 5);

        System.out.println("Keluar dari aplikasi.");
        scanner.close();
    }
}
