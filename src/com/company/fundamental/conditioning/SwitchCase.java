package com.company.fundamental.conditioning;

public class SwitchCase {
  public static void main(String[] args) {
    // Switch Case Statement
    String nilai = "A";
    switch (nilai) {
      case "A":
        System.out.println("Awesome, Kamu lulus dengan grade terbaik");
        System.out.println("Awesome, Kamu lulus dengan grade terbaik");
        break;
      case "B":
        System.out.println("Kamu lulus");
        break;
      case "C":
        System.out.println("Kamu lulus C");
        break;
      case "D":
        System.out.println("Kamu tidak lulus");
        break;
      default:
        System.out.println("Mungkin kamu salah jurusan");
    }
  }
}
