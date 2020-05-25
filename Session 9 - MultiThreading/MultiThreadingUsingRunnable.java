package com.upGrad;

// Java code for thread creation by implementing
// the Runnable Interface
class MultithreadingDemo implements Runnable {
    Thread myMainThread ;
    MultithreadingDemo() {
        myMainThread = new Thread(this, "my main runnable thread");
        System.out.println("my thread created" + myMainThread);
        myMainThread.start();
    }
    public void run() {
        try {
            for (int i=0 ;i<5;i++) {
                System.out.println("Printing thread number : " + i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e) {
            System.out.println("Thread interrupted");
        }
        System.out.println("Successfully executed" );
    }
}
class MultiThreadingUsingRunnnable {
    public static void main(String[] args){
        MultithreadingDemo multithreading = new MultithreadingDemo();
        try{
            while(multithreading.myMainThread.isAlive()) {
                System.out.println("Main thread is alive");
                Thread.sleep(1500);
            }
        }catch(InterruptedException e) {
            System.out.println("Main thread interruption is done");
        }
        System.out.println("Main thread successfully executed" );
    }
}
