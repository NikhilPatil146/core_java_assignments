package com.multithreading;

class SharedResource {
    private boolean ready = false;

    synchronized void produce() {
        try {
            System.out.println("Producer: Producing...");
            Thread.sleep(1000);
            ready = true;
            System.out.println("Producer: Done. Notifying all...");
            notifyAll(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void consume() {
        try {
            while (!ready) {
                System.out.println(Thread.currentThread().getName() + " Waiting...");
                wait(); 
            }
            System.out.println(Thread.currentThread().getName() + " Consuming...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Method {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread consumer1 = new Thread(resource::consume, "Consumer-1");
        Thread consumer2 = new Thread(resource::consume, "Consumer-2");
        Thread producer = new Thread(resource::produce);

        consumer1.start();
        consumer2.start();
        producer.start();
    }
}
