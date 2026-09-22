package com.programs;
import java.util.*;

public class vectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);

        System.out.println("Vector: " + v);
        v.add(1, 15);
        System.out.println("After inserting 15 at index 1: " + v);
        System.out.println("Element at index 2: " + v.get(2));
        v.remove(0);
        System.out.println("After removing index 0: " + v);
    }
}