package com.company;

public class Main {

    public static void main(String[] args) {
        Array numbers = new Array(3);

        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);

//        numbers.insertAt(9, 3);
//        numbers.insertAt(12, 4);
        numbers.insertAt(12, 0);
        numbers.insertAt(12, 0);numbers.insertAt(12, 0);numbers.insertAt(12, 0);numbers.insertAt(12, 0);
        numbers.insertAt(12, 9);
        numbers.insertAt(13, 11);




        numbers.print();
    }
}
