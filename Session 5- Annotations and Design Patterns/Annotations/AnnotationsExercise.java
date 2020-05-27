package com.upGrad;

import java.util.List;

class Base {
    public void run() {
        System.out.println("Display in Parent Class");
    }
    public void printMsg(){
        System.out.println("This method should be  marked as deprecated");
    }
}

interface SquareFI {
    int calculate(int x);
}



public class AnnotationsExercise extends Base {
    public void run() {
        System.out.println("Display in Child Class");
    }
    public static void main(String args[]){
        int a = 10;
        // lambda expression to define the calculate method
        SquareFI s = (int x)->x*x;
    }
}

class Student{
    private List students;
   
    public void addStudent(String name){
        students.add(name);
    }
    public static void main(String[] args){
        Student s = new Student();
        s.addStudent("Ram");
    }
}

