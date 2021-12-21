package com.company.strukturdata.sorting.array;

public class BasicArray {
    public static void main(String[] args) {

        // *note saat

        int[] angka = new int[2]; // membuat array dengan panjang 2

        // cara memasukkan data atau nilai ke array
        angka[0] = 10;
        angka[1] = 4;

        // contoh manipulasi nilai atau data di array
        angka[0] += 3;

        // cara menampilkan nilai atau data dari sebuah array dengan forEach
        for (int i : angka) {
        System.out.println(i);
        }

        // membuat array kosong
        int[] data = new int[0];
        int[] data2;
        int a[] = {};
     
        // mencetak panjang array
        System.out.println("Panjang array 'data' adalah : " + data.length);
        // System.out.println("Panjang array 'data2' adalah : " + data2.length);

        // menambah panjang array
        data2 = new int[2];

        data2[0] = 5;
        System.out.println("Panjang array 'data2' adalah : " + data2.length);

        System.out.println("Panjang array 'a' adalah : " + a.length);

        String teman[] = {"Ronaldo", "Isco", "Bale"};
        for (var t : teman) {
            System.out.println(t);
        }
        // teman[3].
        for (var t : teman) {
            System.out.println(t);
        }
    }
}
