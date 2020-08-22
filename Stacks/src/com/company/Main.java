package com.company;

public class Main {

    public static void main(String[] args) {
        String str = "{{1+[2]{}(<(>)}}";

//        StringReverser reverser = new StringReverser();
//        var result = reverser.reverse(str);

        Expression expression = new Expression();
        System.out.println(expression.isBalanced(str));

    }
}
