package com.upGrad;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImplDemo {
    Queue<Integer> q = new LinkedList<>();

    public void emptyQueue(){
        for(int i=0;i<q.size();i++) {
            System.out.println(q.remove());
        }
    }

    public static void main(String[] args) {
        QueueImplDemo newqueue = new QueueImplDemo();
        // Adds elements
        for (int i=1; i<10; i++) {
            newqueue.q.add(i * 10);
        }
        // Display  queue.
        System.out.println("Elements of queue-"+ newqueue.q);
        // remove the head of queue.
        int head = newqueue.q.remove();
        System.out.println("removed queue head-" + head);
        //printing queue after removal
        System.out.println(newqueue.q);
        // To view the head of queue
        int headQueue  = newqueue.q.peek();
        System.out.println("current head of queue-" + head);
        //size of queue
        int size = newqueue.q.size();
        System.out.println("Size of queue-" + size);
        //empty queue elements
        newqueue.emptyQueue();
    }
}

