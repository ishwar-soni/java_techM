package com.upGrad;

import java.io.*;
import java.util.*;

class Entity {
    String name = "";
    public int count = 0;
    public void entityName(String nameStr, List<String> list)
    {
        // Only one thread can change the name
        synchronized(this) {
            name = nameStr;
            count++; // how many threads change entity's name.
        }
        // All other threads are permitted to add  into list.
        list.add(name);
    }
}
public class BlockSynchronization {
    public static void main (String[] args) {
        Entity ent = new Entity();
        List<String> list = new ArrayList<String>();
        ent.entityName("UpGrad", list);
        System.out.println(ent.name);
    }
}

class SharedObj
{
    // Changes made to sharedVar in one thread
    // may not immediately reflect in other thread
    static int sharedVar = 6;
}


