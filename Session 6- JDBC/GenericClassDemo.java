package com.upGrad;

import sun.net.www.content.text.Generic;

import java.util.ArrayList;
import java.util.List;

public class GenericClassDemo {
    public List names;
    public List<Integer> ids;

    public GenericClassDemo(){
        this.ids = new ArrayList<>();
        this.names = new ArrayList();
    }
    static<T> void generateDisplayElement(T element){
        System.out.println(element.getClass().getName() + " = " + element);
    }

    public void addDataGenericList(String name){
        this.names.add(name);
        System.out.println("Printing the generic list : " + this.names);
    }

    public void addDataIntList(int id){
        this.ids.add(id);
        System.out.println("Printing the integer list : " + this.ids);
    }

    public void autoBoxing(int id){
        this.ids.add(id);
        System.out.println(ids.get(ids.size()-1).getClass().getName());
    }

    public static void main(String[] args){
        GenericClassDemo demo = new GenericClassDemo();
        //calling generic method with Integer argument
        generateDisplayElement(11);
        //calling generic method with String argument
        generateDisplayElement("upGrad");
        //calling generic method with double argument
        generateDisplayElement(1.0);
        //autoboxing
        demo.autoBoxing(1);
        //generic collection
        demo.addDataGenericList("Ram");
        System.out.println(demo.names.get(demo.names.size()-1).getClass().getName());
    }
}
