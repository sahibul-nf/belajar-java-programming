package com.company.fundamental.looping;

public class DoWhile {
    public static void main(String[] args) {
        var name = "Budi";
        int i = 0;

        do {
            if (i == 5) {
                System.out.println(name + " berlari sebanyak " + i + " putaran");
            }

            i++;
        } while (i <= 10);
    }
}
