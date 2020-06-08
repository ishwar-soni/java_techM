package com.upGrad;

import java.util.*;

public class SynchronizedMaps {
    public static void createSynchronizedMap(){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");

        Map<Integer, String> synchronizedMap = Collections.synchronizedMap(map);
        System.out.println("Synchronized map : " + synchronizedMap);
    }

    public static void createSynchronizedSortedMaps(){
        TreeMap<Integer, String> sortedMap = new TreeMap<>();
        sortedMap.put(123,"X");
        sortedMap.put(211,"Z");
        sortedMap.put(153,"T");
        sortedMap.put(564,"W");

        Map<Integer, String> sortedSynchronizedMap = Collections.synchronizedSortedMap(sortedMap);
        System.out.println("Synchronized sorted map : " + sortedSynchronizedMap);
    }
    public static void main(String[] args) throws InterruptedException {

    }
}
