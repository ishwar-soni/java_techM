package com.upGrad;

interface Shape{
    void draw();
}
class RectangleShape implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
class SquareShape implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
class CircleShape implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}

public class ShapeFactory {
    //use getShape method to get object of type shape
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new CircleShape();

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RectangleShape();

        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new SquareShape();
        }

        return null;
    }
}
