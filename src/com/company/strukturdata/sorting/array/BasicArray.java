package com.company.strukturdata.sorting.array;

public class BasicArray {
    public static void main(String[] args) {

        // membuat array kosong
        int dataAngka[];            
        // membuat array dan lansung memsukkan beberapa data
        String dataHuruf[] = { "Cicak", "Harimarau", "C" };     

        // memberi atau menentukan panjang array "dataAngka" 10
        dataAngka = new int[10];

        // cek dan mencetak panjang array dengan fungsi "length"
        System.out.println(dataAngka.length);
        System.out.println(dataHuruf.length);

        // conoth memasukkan data atau nilai ke array
        // memasukkan nilai 80 ke array dataAngka pada indek 10
        dataAngka[10] = 80;
        // memasukkan nilai "Ayam" ke array dataHuruf pada indek 3
        dataHuruf[3] = "Ayam";

        dataAngka[0] = 200;
        dataAngka[1] = 500;
        dataAngka[6] = 100;

        // salah satu contoh memasukkan data ke array lebih automatis
        int dataLama[] = { 1000, 500, 100, 100, 49, 439, 4284, 4284, 193, 193 };

        for (int i = 0; i <= dataAngka.length; i++) {
            dataAngka[i] = dataLama[i];
        }

        // cara akses atau ambil data pada array dataAngka pada index 2
        // dan simpan ke variabel angkaPadaIndex2
        int angkaPadaIndex2 = dataAngka[2];

        // mencetak data atau nilai pada array dengan index tertentu
        System.out.println(dataAngka[2]);

        System.out.println(dataHuruf[1]);

        System.out.println(angkaPadaIndex2);



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

        // menambah panjang array
        data2 = new int[2];

        data2[0] = 5;
        System.out.println("Panjang array 'data2' adalah : " + data2.length);

        System.out.println("Panjang array 'a' adalah : " + a.length);
    }
}
