package com.nongsa;

import java.util.Scanner;

public class PersegiPanjang {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Integer panjang, lebar;
        String cetak;

        System.out.print("Masukkan Panjang  : ");
        panjang = scanner.nextInt();

        System.out.print("Masukkan Lebar  : ");
        lebar = scanner.nextInt();

        for (int i = 0; i < lebar; i++) {
            cetak = "";
            for (int j = 0; j < panjang; j++) {
                cetak += " 0";
            }
            System.out.println(cetak);
        }
    }
}
