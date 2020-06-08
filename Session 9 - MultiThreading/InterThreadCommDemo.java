package com.upGrad;

import java.util.Scanner;

class MultiplyData extends Thread{
    int a,b;
    public void multiplyNumber() throws InterruptedException {
        synchronized (this){
            System.out.println("Waiting for user to write data");
            wait();
            System.out.println("Result is :" + (a*b));
            System.out.println("Data reading/writing  done");
        }
    }
    public void readData() throws InterruptedException {
        Thread.sleep(1200);
        Scanner sc = new Scanner(System.in);
        synchronized (this){
            System.out.println("Please enter first number");
            a = sc.nextInt();
            System.out.println("Please enter second number");
            b = sc.nextInt();
            System.out.println("Data has been entered by the user: " + a + " and " + b );
            notify();
            Thread.sleep(2500);
        }

    }


}

public class InterThreadCommDemo {
    public static void main(String[] args) throws InterruptedException {
        MultiplyData multiplyData = new MultiplyData();
    Thread thread1 = new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                multiplyData.multiplyNumber();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    });
    Thread thread2 = new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                multiplyData.readData();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    });
    thread1.start();
    thread2.start();
    thread1.join();
    thread2.join();
}

}
