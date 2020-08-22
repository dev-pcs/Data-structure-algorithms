package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        var list = new LinkedList();
//        System.out.println(list.size());
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.addLast(8);
        list.addLast(9);


//        System.out.println(list.size());
//        list.reverse();
//        System.out.println(list.size());

//        list.deleteLast();
//        list.deleteFirst();
//
////        System.out.println(list.size());
//        var array = list.toArray();
        System.out.println(list.size());
        System.out.println(list.getKthFromTheEnd(6));
    }
}
