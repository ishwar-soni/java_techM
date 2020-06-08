package com.upGrad;

import java.util.Scanner;
import java.util.concurrent.*;

public class FutureDemo {
    public static void main(String[] args)
            throws InterruptedException, ExecutionException {
        System.out.println("Please enter your distance");
        Scanner sc = new Scanner(System.in);
        double dist = sc.nextDouble();
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<Double> dieselCostF = service.submit(new CostInDiesel(dist));
        Future<Double> petrolCostF = service.submit(new CostInPetrol(dist));
        System.out.println("Cost in diesel " + dieselCostF.get());
        System.out.println("Cost in petrol " + petrolCostF.get());
        service.shutdown();
    }
}

class CostInDiesel implements Callable<Double> {
    double distance = 0.0;
    int dieSelCost = 65/14;
    public CostInDiesel(double d) {
        distance = d;
    }
    @Override
    public Double call() throws Exception {
        return distance*dieSelCost;
    }
}
class CostInPetrol implements Callable<Double> {
    double distance = 0.0;
    int petrolCost = 80/12;
    public CostInPetrol(double d) {
        distance = d;
    }
    @Override
    public Double call() throws Exception {
        return distance*petrolCost;
    }
}