package com.upGrad;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratingList {
    public static void iterateUsingForEach() {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(11);
        l.add(12);
        l.add(13);
        l.add(14);
        l.forEach(System.out::println);
    }

    public static void main(String[] args) {
        iterateUsingForEach();
    }


    public static void failFastIterator(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0;i<6;i++)
            arrayList.add(i);
        Iterator<Integer> i = arrayList.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
            arrayList.add(10);
        }
    }

    public static void failSafeIterator(){
        CopyOnWriteArrayList<Integer> list
                = new CopyOnWriteArrayList<Integer>(new Integer[] { 1, 3, 5, 8 });
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            Integer no = (Integer)itr.next();
            System.out.println(no);
            if (no == 8)
                // This will not print,
                // hence it has created separate copy
                list.add(14);
        }
    }

    public static void enumeration(){
        // Create a vector and print its contents
        Vector<Integer> v = new Vector<Integer>();
        for (int i = 0; i < 10; i++)
            v.addElement(i);
        System.out.println(v);
        // At beginning e(cursor) will point to
        // index just before the first element in v
        Enumeration<Integer> e = v.elements();
        // Checking the next element availability
        while (e.hasMoreElements()) {
            // moving cursor to next element
            int i = (Integer)e.nextElement();
            System.out.print(i + " ");
        }
    }

    public static void iterateUsingIterator(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0;i<6;i++)
            arrayList.add(i);
        // at beginning itr(cursor) will point to
        // index just before the first element in al
        Iterator itr = arrayList.iterator();
        // checking the next element availabilty
        while (itr.hasNext()) {
            //  moving cursor to next element
            int i = (Integer) itr.next();
            // getting even elements one by one
            System.out.print(i + " ");
            // Removing odd elements
            if (i % 2 != 0)
                itr.remove();
        }
        System.out.println("\nUpdated list : " + arrayList);
    }
}
