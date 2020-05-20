package com.upGrad;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.SQLOutput;

public class ExceptionHandling{

    public static void finallyBlockExecution(){
        String name = "upGrad" ;
        try{
            System.out.println("Name:" + name);
            System.out.println("Exit from try block");
        }catch(NullPointerException ex) {
            System.out.println("Catch block executed...");
        }finally {
            System.out.println("finally block executed");
        }
        // rest program will be executed
        System.out.println("Outside try-catch-finally clause");
    }
    public static void main(String args[]) {
       finallyBlockExecution();
    }
}

