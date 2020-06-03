package com.upGrad;

interface Shape{
    void drawShape();
}
class Rectangle implements Shape {
    @Override
    public void drawShape() {
        System.out.println("Drawing a new Rectangle .");
    }
}
class Square implements Shape {
    @Override
    public void drawShape() {
        System.out.println("Drawing a new Square");
    }
}
class Circle implements Shape {
    @Override
    public void drawShape() {
        System.out.println("Drawing a new Circle");
    }
}
public class ShapeFactory {
    //use getShape method to get object of type shape
    public Shape getShape(String shapeType){
        if(shapeType == null)
            return null;
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
