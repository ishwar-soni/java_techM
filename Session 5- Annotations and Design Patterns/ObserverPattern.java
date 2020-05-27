package com.upGrad;

import java.util.ArrayList;
import java.util.List;

class Subject{
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

abstract class Observer {
    protected Subject subject;
    public abstract void update();
}

class StudentObserver extends Observer{

    public StudentObserver(Subject subject){
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println( "Student Observer : " +  subject.getState()  );
    }
}

class TeacherObserver extends Observer{

    public TeacherObserver(Subject subject){
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println( "Teacher Observer : " +  subject.getState()  );
    }
}


public class ObserverPattern {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new StudentObserver(subject);
        new TeacherObserver(subject);
        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
