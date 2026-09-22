package com.programs;

class SharedBuffer {
    int data;
    boolean hasData = false;

    synchronized void produce(int value) {
        while (hasData) {
            try { wait(); } catch (Exception e) {}
        }
        data = value;
        hasData = true;
        System.out.println("Produced: " + data);
        notify();
    }

    synchronized void consume() {
        while (!hasData) {
            try { wait(); } catch (Exception e) {}
        }
        System.out.println("Consumed: " + data);
        hasData = false;
        notify();
    }
}

class Producer extends Thread {
    SharedBuffer b;
    Producer(SharedBuffer b) { this.b = b; }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            b.produce(i);
            try { Thread.sleep(500); } catch(Exception e){}
        }
    }
}

class Consumer extends Thread {
    SharedBuffer b;
    Consumer(SharedBuffer b) { this.b = b; }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            b.consume();
            try { Thread.sleep(500); } catch(Exception e){}
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();
        new Producer(buffer).start();
        new Consumer(buffer).start();
    }
}