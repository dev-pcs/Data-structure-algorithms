package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        var list = new LinkedList();
        System.out.println(list.size());
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        System.out.println(list.size());
        list.reverse();
//        System.out.println(list.size());

//        list.deleteLast();
//        list.deleteFirst();
//
////        System.out.println(list.size());
        var array = list.toArray();
        System.out.println(Arrays.toString(array));
    }
}
