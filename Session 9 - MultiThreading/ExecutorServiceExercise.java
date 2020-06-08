package com.upGrad;

import java.util.Scanner;
import java.util.concurrent.*;

public class ExecutorServiceExercise {
    public static void main(String[] args)
            throws InterruptedException, ExecutionException {
        System.out.println("Please enter your dimension");
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<Integer> areaF = service.submit(new CalculateArea(side));
        Future<Integer> perimeterF = service.submit(new CalculatePerimeter(side));
        System.out.println("Area : " + areaF.get());
        System.out.println("Perimeter " + perimeterF.get());
        service.shutdown();
    }
}

class CalculateArea implements Callable<Integer> {
    int side;
    public CalculateArea(int side) {
        this.side = side;
    }
    @Override
    public Integer call() throws Exception {
        return side*side;
    }
}

class CalculatePerimeter implements Callable<Integer> {
    double distance = 0.0;
    int side;
    public CalculatePerimeter(int side) {
        this.side = side;
    }
    @Override
    public Integer call() throws Exception {
        return 4*side;
    }
}