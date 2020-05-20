package com.upGrad;

public class ThrowThrowsandFinalize {
    public void fun() throws ClassNotFoundException {
        try{
            throw new ClassNotFoundException("demo");
        }catch(ClassNotFoundException e) {
            System.out.println("Caught inside fun().");
            throw e; // rethrowing the exception
        }
    }
    public void throwsExcep() throws InterruptedException {
        Thread.sleep(10000);
        System.out.println("Hello Geeks");
    }

}