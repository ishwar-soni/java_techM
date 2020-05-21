package com.upGrad;
import java.util.*;
public class HashSetIterator {
    public static void iterateSet(Set<Integer> set){
        Iterator<Integer> i  = set.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
    public static void main(String[] args){
        //implementing Hashset
        HashSet<Integer> newHashSet = new HashSet<>();
        newHashSet.add(1);
        newHashSet.add(2);
        newHashSet.add(3);
        newHashSet.add(4);
        newHashSet.add(5);
        System.out.println("Iterating a hashset");
        iterateSet(newHashSet);
        //implementing LinkedHashSet
        LinkedHashSet<Integer> newLinkedHashSet = new LinkedHashSet<>();
        newLinkedHashSet.add(20);
        newLinkedHashSet.add(10);
        newLinkedHashSet.add(40);
        newLinkedHashSet.add(30);
        newLinkedHashSet.add(50);
        System.out.println("Iterating a LinkedHashSet");
        iterateSet(newLinkedHashSet);
        //implementing TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(500);
        treeSet.add(400);
        treeSet.add(300);
        treeSet.add(200);
        treeSet.add(100);
        System.out.println("Iterating a TreeSet");
        iterateSet(treeSet);

    }
}
