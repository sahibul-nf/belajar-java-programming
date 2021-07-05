package com.company.fundamental.conditioning;

public class IfElse {
  public static void main(String[] args) {

    // If - Else
    int scoreProgramming = 80;
    if (scoreProgramming > 80) {
      System.out.println("Your a Expert Programmer");
      if (scoreProgramming > 80) {
        System.out.println("Your a Expert Programmer");
      }
    } 
    else if (scoreProgramming > 60 && scoreProgramming <= 80) {
      System.out.println("Your a Good Programmer");
    }
    else {
      System.out.println("Kamu tidak memenuhi kondisi untuk jadi programmer");
    }

    // Ternary
    String statusProgrammer = scoreProgramming > 80 
      ? "Your a Expert Programmer" 
      : scoreProgramming > 60 && scoreProgramming <= 80
      ? "Your a Good Programmer"
      : "Kamu tidak memenuhi kondisi untuk jadi programmer";

      System.out.println(statusProgrammer);
  }
}
