package com.nongsa;

import java.util.Scanner;

public class Segitiga {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tinggi segitiga: ");
        String cetak;

        int tinggi = scanner.nextInt();
        for (int i = tinggi, k = 0; i >= 0 && k <= tinggi; i--, k++) {
             cetak = "";
            for (int j = 0; j < i; j++) {
                cetak += " ";
            }
            for (int j = 0; j < k; j++) {
                cetak  += "*";
            }
            for (int j = 1; j < k; j++) {
                cetak += "*";
            }
            System.out.println(cetak);
        }
    }
}
