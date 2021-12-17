package com.company.strukturdata.sorting;

import java.util.Scanner;

/*
    =-=-=-=-= Exp output this program =-=-=-=-=

    Masukkan sebuah kalimat:
    Saya hari ini belajar struktur data
    #(ini contoh kalimat, program yang dibuat harus bisa menerima masukan kalimat apa saja)

    1. Ascending
    2. Descending
    Pilih jenis pengurutan: 1

    belajar
    data
    hari
    ini
    Saya
    struktur

    #(jika yang dipilih nomor 2, maka hasilnya sebaliknya)
*/

public class SortingPractices {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hai, input sesuatu disini : ");
        String userInput = scanner.nextLine();

        int opsi;
        String[] words = userInput.split("\\s+");

        System.out.print("\n1. Ascending \n2. Descending");
        System.out.print("\nPilih jenis pengurutan: ");
        opsi = scanner.nextInt();

        SortingPractices.countWords(words);
        SortingPractices.insertionSort(words, opsi);

        for (String a: words) {
            System.out.println(a + " ");
        }

        scanner.close();
    }

    // This function for count the number of word
    public static void countWords(String[] words) {
        int countWords = 0;
        countWords += words.length;
        System.out.println("\nJumlah kata : " + countWords);
    }

    // This is the Insertion Sort Algorithm for order data
    public static void insertionSort(String[] data, int opsi) {
        for (int i = 0; i < data.length; i++) {
            String temp = data[i];
            int n;

            switch (opsi) {
                case 1:
                    for (n = i-1; n >= 0 && data[n].charAt(0) > temp.charAt(0); n--) {
                        data[n+1] = data[n];
                    }
                    data[n+1] = temp;
                    break;
                case 2:
                    for (n = i-1; n >= 0 && data[n].charAt(0) < temp.charAt(0); n--) {
                        data[n+1] = data[n];
                    }
                    data[n+1] = temp;
                    break;
            }
        }
    }
}
