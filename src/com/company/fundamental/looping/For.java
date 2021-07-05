package com.company.fundamental.looping;

public class For {
  public static void main(String[] args) {

    int i;
    for (i = 0; i <= 5; i++) {
      System.out.println("Sekarang putaran ke- " + i);
      for (int j = 0; j <= 10; j++) {
        System.out.println("Sekarang putaran ke- " + i);
      }
    }

  }
}
