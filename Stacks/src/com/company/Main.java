package com.company;

public class Main {

    public static void main(String[] args) {
        Stack stack =new Stack();
        stack.push(12);
        stack.push(13);
        stack.push(342);
        stack.push(43);

        System.out.println(stack.peek());
    }
}
