package com.nongsa;

import java.util.Scanner;

public class Persegi {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        Integer sisi;

        System.out.print("Masukkan Panjang sisi : ");
        sisi = scanner.nextInt();

        for (int i = 0; i < sisi; i++) {
            String cetak = "";
            for (int j = 0; j < sisi; j++) {
                cetak += " 0";
            }
            System.out.println(cetak);
        }
    }
}
