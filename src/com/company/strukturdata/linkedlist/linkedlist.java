package com.company.strukturdata.linkedlist;

import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {

        String[] peoples = {"Andi", "Messi", "Ronaldo"};
        LinkedList<String> friendList = new LinkedList<>();
        var myFriend = "Messi";

        for (String people : peoples) {
            if (people.contains(myFriend)) {
                friendList.add(people);
            }
        }

        for (String people : friendList) {
            if (people.contains(myFriend)) {
                System.out.println("Ini teman ku dari sekian banyak orang : " +people);
            }
        }


    }
}
