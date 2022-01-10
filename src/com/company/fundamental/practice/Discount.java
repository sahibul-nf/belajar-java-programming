package com.company.fundamental.practice;

class Discount {
    public static void main(String[] args) {
        int price = 200_000;
        double discount = 0.05;
        double buy;
        
        if (price == 250_000) {
           buy = price - (price * discount);
        } else if (price == 200_000) {
            buy = price - (price * discount);
        } else if (price == 150_000) {
            buy = price - (price * discount);
        } else {
            System.out.println("Anda belum beruntung!");
        }
    }
}