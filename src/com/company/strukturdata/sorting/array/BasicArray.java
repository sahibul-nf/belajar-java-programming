package com.company.strukturdata.sorting.array;

public class BasicArray {
    public static void main(String[] args) {

        int[] angka = new int[2];   // membuat array dengan panjang 2

        // cara memasukkan data atau nilai ke array
        angka[0] = 10;
        angka[1] = 4;
        
        // contoh manipulasi nilai atau data di array
        angka[0] += 3;

        // cara menampilkan nilai atau data dari sebuah array dengan forEach 
        for (int dataAngka : angka) {
            System.out.println(dataAngka);
        }

        // membuat array kosong
        int[] data = new int[0];
        int[] data2;

        // mencetak panjang array
        System.out.println("Panjang array 'data' adalah : " + data.length);

        // menambah panjang array
        data2 = new int[2];
        data2[0] = 5;
        System.out.println("Panjang array 'data2' adalah : " + data2.length);

    }
}
