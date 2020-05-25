package com.upGrad;
// Java code for thread creation by extending
// the Thread class
class Multithreading extends Thread {
    Multithreading() {
        System.out.println("New thread created : " + this);
        start();
    }
    public void run() {
        try {
            for (int i=0 ;i<5;i++) {
                System.out.println("Printing thread number : " + i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e) {
            System.out.println("Thread interrupted");
        }
        System.out.println("Successfully executed" );
    }
}
// Creating and running threads
public class MultiThreadingUsingThread {
    public static void main(String[] args)
    {
        Multithreading multithreading = new Multithreading();
        try{
            while(multithreading.isAlive()) {
                System.out.println("Main thread is alive");
                Thread.sleep(1500);
            }
        }catch(InterruptedException e) {
            System.out.println("Main thread interruption is done");
        }
        System.out.println("Main thread successfully executed" );
    }

   /* public static void main(String[] args) {
        int n = 8; // Number of threads
        for (int i=0; i<n; i++){
            Multithreading obj1 = new Multithreading();
            obj1.start();
        }
    }*/
}
