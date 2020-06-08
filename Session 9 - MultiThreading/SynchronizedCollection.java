package com.upGrad;

import java.util.*;

public class SynchronizedCollection {
    public static void createSynchronizedList(){
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i<1000; i=i*2){
            list.add(i);
        }
        System.out.println("List : " + list);
        // create a synchronized list
        List<Integer> synchronizedList = Collections.synchronizedList(list);
        System.out.println("Synchronized list : " + synchronizedList);
    }

    public static void createSynchronizedSet(){
        HashSet<Integer> set = new HashSet<>();
        for(int i=1;i<1000;i = i*2){
            set.add(i);
        }
        System.out.println("Set is :" + set);
        // create a synchronized set
        Set<Integer> synchronizedSet = Collections.synchronizedSet(set);
        System.out.println("Synchronized set: " + synchronizedSet);

    }
    public static void main(String[] args) throws InterruptedException {
        List<String> alphabetList = Collections.synchronizedList(Arrays.asList("X", "Y", "Z"));
        List<String> lowerCaseList = new ArrayList<>();
        Runnable convertToLowerCase = () -> {
            synchronized (alphabetList) {
                alphabetList.forEach((e) -> {
                    lowerCaseList.add(e.toLowerCase());
                    System.out.println(e.toLowerCase());
                });
            }
        };
        Thread t1 = new Thread(convertToLowerCase);
        t1.start();

        createSynchronizedList();
        createSynchronizedSet();
    }
}
