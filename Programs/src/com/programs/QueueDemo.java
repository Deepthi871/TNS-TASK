package com.programs;
import java.util.*;

public class QueueDemo{
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("A");
        q.add("B");
        q.add("C");
        
        System.out.println("Queue: " + q);
        System.out.println("Removed: " + q.poll());
        System.out.println("Head: " + q.peek());
        System.out.println("Final Queue: " + q);
    }
}