package com.company.strukturdata.sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class SelectionSort {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    // variabel penampung dari inputan
    ArrayList<Character> huruf = new ArrayList<>();
    ArrayList<Integer> angka = new ArrayList<>();

    System.out.print("Masukkan Data : ");
    // variabel "kalimat" adalah penampung inputan dari user
    String kalimat = input.nextLine();
    // mengubah teks inputan yang di tampung variabel -
    // "kalimat" ke huruf kecil semua
    kalimat.toLowerCase();

    // teks inputan berupa pada varibale "kalimat" kita ubah -
    // ke bentuk "char"(per karakter), lalu kita tampung ke -
    // variabel "kata" bertipe Array
    char[] kata = kalimat.toCharArray();

    // variabel "kata3 & kata2" sebagai bantuan untuk keperluan -
    // mengambil/memisah angka dan huruf
    int kata3;
    char kata2;

    // lopping untuk mapping atau meng-extract isi/data dari -
    // varibale "kata" dan nantinya kita masukkan ke variabel -
    // ArrayList "huruf dan angka" di atas
    for (int i = 0; i < kata.length; i++) {
      // mem-filter data angka dan memasukannya ke -
      // ArrayList "angka"
      if (kata[i] >= '0' && kata[i] <= '9') {
        kata2 = kata[i];
        kata3 = Character.getNumericValue(kata2);
        angka.add(kata3);
      }
      // mem-filter data angka dan memasukannya ke -
      // ArrayList "huruf"
      else if (kata[i] >= 'a' && kata[i] <= 'z') {
        kata2 = kata[i];
        huruf.add(kata2);
      }
    }

    // proses sorting angka dan huruf

    int data_bil[] = new int[angka.size()];
    for (int r = 0; r < angka.size(); r++) {
      int bil = angka.get(r);
      data_bil[r] = bil;
    }

    char data_huruf[] = new char[huruf.size()];
    for (int r = 0; r < huruf.size(); r++) {
      char str = huruf.get(r);
      data_huruf[r] = str;
    }

    // sorting data huruf dengan descending
    sortingDataHuruf(data_huruf);

    System.out.println();

    // sorting data angka dengan ascending
    sortingDataAngka(data_bil);

    input.close();
  }

  public static void sortingDataAngka(int[] dataAngka) {
    System.out.print("Sorting Data Angka : ");
    for (int x = 0; x < dataAngka.length - 1; x++) {
      int min = x;
      for (int y = x + 1; y < dataAngka.length; y++) {
        if (dataAngka[y] < dataAngka[min]) {
          min = y;
        }
      }
      int temp = dataAngka[min];
      dataAngka[min] = dataAngka[x];
      dataAngka[x] = temp;
    }

    for (int z = 0; z < dataAngka.length; z++) {
      System.out.print(dataAngka[z] + " ");
    }
    System.out.print("(ascending)\n");
  }

  public static void sortingDataHuruf(char[] dataHuruf) {
    System.out.print("Sorting Data Huruf : ");
    for (int x = 0; x < dataHuruf.length - 1; x++) {
      int min = x;
      for (int y = x + 1; y < dataHuruf.length; y++) {
        if (dataHuruf[y] > dataHuruf[min]) {
          min = y;
        }
      }
      char temp = dataHuruf[min];
      dataHuruf[min] = dataHuruf[x];
      dataHuruf[x] = temp;
    }

    for (int z = 0; z < dataHuruf.length; z++) {
      System.out.print(dataHuruf[z] + " ");
    }
    System.out.print("(descending)\n");
  }
}
