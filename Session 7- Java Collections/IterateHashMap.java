package com.upGrad;

import java.util.*;

public class IterateHashMap {
    public void iterateUsingEntrySet(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
    public void iterateUsingIteratorAndEntry(Map<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
    public void iterateUsingLambda(Map<String, Integer> map) {
        map.forEach((k, v) -> System.out.println((k + ":" + v)));
    }

    public static void main(String[] args){
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "A");
        hashMap.put(2, "B");
        hashMap.put(3, "C");
        hashMap.put(4, "D");
        

        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(10, "F");
        linkedHashMap.put(34, "E");
        linkedHashMap.put(23, "G");
        linkedHashMap.put(41, "H");

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(110, "X");
        treeMap.put(342, "Y");
        treeMap.put(232, "Z");
        treeMap.put(410, "W");


    }
}
