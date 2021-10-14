package com.nongsa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nilai;
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nMasukkan Nilai (0 - 100): ");
        nilai = scanner.nextInt();
        if (nilai <= 20 && nilai >=0) {
            System.out.println("Nilai Anda : E");
        } else if (nilai <=40 && nilai >= 21) {
            System.out.println("Nilai Anda : D");
        } else if (nilai <=60 && nilai >= 41) {
            System.out.println("Nilai Anda : C");
        } else  if (nilai <= 80 && nilai >= 61) {
            System.out.println("Nilai Anda : B");
        } else if (nilai <= 100 && nilai >= 81){
            System.out.println("Nilai Anda : A");
        } else {
            System.out.println("Nilai yang anda masukkan Tidak Valid");
        }
    }
}
