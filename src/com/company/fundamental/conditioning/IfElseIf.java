package com.company.fundamental.conditioning;

public class IfElseIf {
  public static void main(String[] args) {
    // Contoh 1
    // If - ElseIf - Else
    int nilaiMahasiswa = 60;

    if (nilaiMahasiswa > 80) {
      System.out.println("Kamu lulus dengan sangat baik");
    } else if (nilaiMahasiswa <= 80 && nilaiMahasiswa > 70) {
      System.out.println("Kamu lulus");
    } else if (nilaiMahasiswa > 50 && nilaiMahasiswa <= 70) {
      System.out.println("Kamu lulus tapi kurang baik");
    } else {
      System.out.println("Kamu salah jurusan!");
    }

    // Contoh 2
    // If - ElseIf
    if (nilaiMahasiswa > 80) {
      System.out.println("Kamu lulus dengan sangat baik");
    } else if (nilaiMahasiswa <= 80 && nilaiMahasiswa > 70) {
      System.out.println("Kamu lulus");
    } else if (nilaiMahasiswa > 50 && nilaiMahasiswa <= 70) {
      System.out.println("Kamu lulus tapi kurang baik");
    }

    System.out.println("Kamu salah jurusan!");
  }
}
