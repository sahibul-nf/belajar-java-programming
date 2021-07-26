package com.company.interview;

/* Soal

    dik:
    a = 8;
    b = 1;

    function swap() {
        // do swap
    }

    output:
    a = 1
    b = 8
*/

/**
 * Author : sahibul_nf
 */

public class Swap {
    static int a = 20;
    static int b = 10;

    public static void main(String[] args) {
        Swaping.swap(a, b);
    }

    static class Swaping {
        static void swap(int valueA, int valueB) {
            if (valueA != valueB) {
                a = valueB;
                b = valueA;
                System.out.println(a);
                System.out.println(b);
            }
        }
    }
}
