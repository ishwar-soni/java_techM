package com.upGrad;
class Track {
    synchronized public void getTrack() {
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            } } }
}
class Car extends Thread {
    Track track;
    Car(Track track) {
        this.track = track;
    }
    @Override
    public void run() {
        track.getTrack();
    }}
public class MethodSynchronization {
    public static void main(String[] args) {
        Track obj = new Track();
        // we are creating two threads which share same Object.
        Car car1 = new Car(obj);
        Car car2 = new Car(obj);
        // both threads start executing .
        car1.start();
        car2.start();
    }
}
