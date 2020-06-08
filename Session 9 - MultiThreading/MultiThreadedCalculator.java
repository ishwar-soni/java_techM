package com.upGrad;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

class Sum extends Thread{
    int i,j;
    Sum(int i, int j){
        this.i = i;
        this.j = j;
    }
    public void run(){
        System.out.println("Sum operation");
        System.out.println("Sum = " + (i+j));
    }
}
class Difference extends Thread{
    int i,j;
    Difference(int i, int j){
        this.i = i;
        this.j = j;
    }
    public void run(){
        System.out.println("Difference operation");
        System.out.println("Difference = " + (i-j));
    }
}
class MultiPly extends Thread{
    int i,j;
    MultiPly(int i, int j){
        this.i = i;
        this.j = j;
    }
    public void run(){
        System.out.println("Multiplication operation");
        System.out.println("Multiplication = " + (i*j));
    }
}
class Division extends Thread{
    int i,j;
    Division(int i, int j){
        this.i = i;
        this.j = j;
    }
    public void run(){
        System.out.println("Division operation");
        System.out.println("Division = " + (i/j));
    }
}

public class MultiThreadedCalculator {
    public static void main(String[] args){
        System.out.println("Please choose your operation: ");
        System.out.println("ADD");
        System.out.println("SUBTRACT");
        System.out.println("MULTIPLY");
        System.out.println("DIVISION");
        Scanner sc = new Scanner(System.in);
        int operationId = sc.nextInt();
        System.out.println("Please enter digit 1");
        int i = sc.nextInt();
        System.out.println("Please enter digit 2");
        int j = sc.nextInt();
        switch (operationId){
            case 1:
                System.out.println("Addition");
                Sum sum = new Sum(i,j);
                sum.start();
                break;
            case 2:
                System.out.println("Subtraction");
                Difference difference = new Difference(i,j);
                difference.start();
                break;
            case 3:
                System.out.println("Multiplication");
                MultiPly multiPly = new MultiPly(i,j);
                multiPly.start();
                break;
            case 4:
                System.out.println("Division");
                Division division = new Division(i,j);
                division.start();
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
