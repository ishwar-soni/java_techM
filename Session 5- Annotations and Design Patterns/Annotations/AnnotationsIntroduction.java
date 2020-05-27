package com.upGrad;

class Base {
    public void display() {
        System.out.println("Display in Parent Class");
    }
}
@FunctionalInterface
interface SquareFI {
    int calculate(int x);
}


public class AnnotationsIntroduction extends Base {
    @Override
    public void display() {
        System.out.println("Display in Child Class");
    }
    public static void main(String args[]){
        int a = 5;
        // lambda expression to define the calculate method
        SquareFI s = (int x)->x*x;
        // parameter passed and return type must be
        // same as defined in the prototype
        int ans = s.calculate(a);
        System.out.println(ans);
    }
}

