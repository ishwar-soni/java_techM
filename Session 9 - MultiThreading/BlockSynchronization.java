package com.upGrad;

class Count {
    int number = 0;

    public void incrementNumber() {
        this.number++;
    }
}

class Counter extends Thread {
    private Count count;

    public Counter(Count counter) {
        this.count = counter;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (this.count) {
                count.incrementNumber();
                System.out.println("Counter :" + count.number);
            }
        }
    }
}

public class BlockSynchronization {
    public static void main(String[] args) {
        Count counter = new Count();
        Counter counter1 = new Counter(counter);
        Counter counter2 = new Counter(counter);
        Counter counter3 = new Counter(counter);
        counter1.start();
        counter2.start();
        counter3.start();
    }
}
