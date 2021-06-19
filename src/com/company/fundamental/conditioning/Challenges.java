package com.company.fundamental.conditioning;

import java.util.Scanner;

public class Challenges {
  public static void main(String[] args) {
    // Multiple IF
    // Kasus login
    String usernameData = "sahibul_nf";
    String passwordData = "123";

    Scanner userInput = new Scanner(System.in);

    System.out.print("Username : ");
    String usernameInput = userInput.nextLine();

    System.out.print("Password : ");
    String passwordInput = userInput.nextLine();

    System.out.println();

    if (usernameInput.isEmpty() && passwordInput.isEmpty()) {
      System.out.println("Username dan Password belum diisi");
    } else if (!usernameInput.isEmpty() && passwordInput.isEmpty()) {
      System.out.println("Password belum diisi");
    } else if (usernameInput.isEmpty() && !passwordInput.isEmpty()) {
      System.out.println("Username belum diisi");
    } else {
      if (!usernameData.equals(usernameInput) && !passwordData.equals(passwordInput)) {
        System.out.println("Login gagal!\nUsername dan Password kamu salah, coba yang lain!");
      } else if (usernameData.equals(usernameInput) && !passwordData.equals(passwordInput)) {
        System.out.println("Login gagal!\nKamu belum isi password, coba isi dulu!");
      } else if (!usernameData.equals(usernameInput) && passwordData.equals(passwordInput)) {
        System.out.println("Login gagal!\nUsername kamu salah, coba yang lain!");
      } else {
        System.out.println("Login berhasil!");
        System.out.println("Silahkan akses fitur kami yang tersedia");
      }
    }

    System.out.println("\n\n");

    // Review error | Fixing logic
    boolean cekKesamaan = usernameData == usernameInput; // jika pake cek kesamaan sebuah tipe String pake ==
    System.out.println(cekKesamaan); // maka hasilnya adalah tidak sama atau false nilai cek kesamaannya

    cekKesamaan = usernameData.equals(usernameInput); // jika pake cek kesamaan sebuah tipe String pake method equals()
    System.out.println(cekKesamaan); // maka hasilnya adalah sama atau true nilai cek kesamaannya
  }
}
