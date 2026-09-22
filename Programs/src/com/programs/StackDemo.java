package com.programs;
import java.util.*;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("Java");
        s.push("Python");
        s.push("C++");
        
        System.out.println("Stack: " + s);
        System.out.println("Popped: " + s.pop());
        System.out.println("Top element: " + s.peek());
        System.out.println("Final Stack: " + s);
    }
}