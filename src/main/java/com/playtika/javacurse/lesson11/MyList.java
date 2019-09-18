package com.playtika.javacurse.lesson11;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("One");
        list.add("two");
        list.add("Three");
        list.add(2, "two_and_half");
        list.set(1, "two_and_one");
        list.remove(3);

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.get(4));
        System.out.println(list.contains("Three"));
        System.out.println(list.contains("three"));

    }
}
