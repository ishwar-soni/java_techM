package com.upGrad;

interface Vehicle{
    void createVehicle();
}
class Car implements Vehicle {
    @Override
    public void createVehicle() {
        System.out.println("Creating a new car");
    }
}
class Bike implements Vehicle {
    @Override
    public void createVehicle() {
        System.out.println("Creating a new bike");
    }
}
class Scooter implements Vehicle {
    @Override
    public void createVehicle() {
        System.out.println("Creating a new Scooter");
    }
}
public class VehicleFactory {
    //use getShape method to get object of type shape
    public Shape getVehicle(String vehicleType){
        if(vehicleType == null)
            return null;
        if(vehicleType.equalsIgnoreCase("CAR")){
            return new Car();

        }else if(vehicleType.equalsIgnoreCase("BIKE")){
            return new Bike();

        }else if(vehicleType.equalsIgnoreCase("SCOOTER")){
            return new Scooter();
        }
        return null;
    }
}
