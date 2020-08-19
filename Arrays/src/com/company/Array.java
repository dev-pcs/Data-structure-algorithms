package com.company;

import java.util.Arrays;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }

    public void insert(int item) {
        if (items.length == count) {
            int[] newItems = new int[count*2];
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];
            items = newItems;
        }
        items[count++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();
        for (int i = index; i < count; i++)
            items[i] = items[i + 1];
        count--;
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;
        return -1;
    }

    public int max(){
        int max = 0;
        for (int i = 0; i < count; i++) {
            if (items[i] > max) {
                max = items[i];
            }
        }return max;
    }

    public void reverse(){
        for (int left = 0, right = count-1; left < right; left ++, right--) {
            int temp = items[left];
            items[left] = items[right];
            items[right] = temp;
        }
    }

    public void insertAt(int item, int index) {
        insert(0);
        for (int i = count-1; i > index; i--) {
            items[i] = items[i-1];
        }
        items[index] = item;
    }

    
}
