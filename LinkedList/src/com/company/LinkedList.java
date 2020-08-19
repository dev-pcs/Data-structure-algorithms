package com.company;

public class LinkedList {

    private class Node {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;

    public void addLast(int item) {
        var node  = new Node(item);
        node.next = null;

        if (first == null)
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
    }
}
