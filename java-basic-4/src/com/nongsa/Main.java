package com.nongsa;

import java.util.Scanner;

public class Main {

    static char tentukan(int n) {
        char h = 'E';
        if (n <= 20 && n >= 0) {
            h = 'E';
        } else if (n <= 40 && n >= 21) {
            h = 'D';
        } else if (n <= 60 && n >= 41) {
            h = 'C';
        } else if (n <= 80 && n >= 61) {
            h = 'B';
        } else if (n <= 100 && n >= 81) {
            h = 'A';
        } else {
            System.out.println("Nilai yang anda masukkan Tidak Valid");
            System.exit(0);
        }
        return h;
    }

    public static void main(String[] args) {
        int nilai;
        char has;
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nMasukkan Nilai (0 - 100): ");
        nilai = scanner.nextInt();

        has = tentukan(nilai);
        System.out.println("Nilai Anda : " + has);

    }

}
