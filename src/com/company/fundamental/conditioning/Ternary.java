package com.company.fundamental.conditioning;

public class Ternary {
  // Ternary Operator
  int scoreProgramming = 80;
  String statusProgrammer =
      scoreProgramming >= 80
          ? "Your a expert programmer"
          : scoreProgramming >= 65 && scoreProgramming < 80
              ? "Your a good programmer"
              : "Your a beginner programmer";
}
