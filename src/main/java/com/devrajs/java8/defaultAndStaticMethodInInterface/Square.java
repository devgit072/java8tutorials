package com.devrajs.java8.defaultAndStaticMethodInInterface;

public class Square implements Shape {

    double area;

    @Override
    public double calculateArea(double shapeSize) {
        area = shapeSize * shapeSize;
        return area;
    }

    @Override
    public double getArea() {
        return area;
    }
    /*
    If you want then you can override static and default method of interface and its optional, static and default are
    meant to not be overridden or should be overridden by only rare class.
     */
    public static void main(String[] args) {
        Shape shape = new Square();
        System.out.println(shape.calculateArea(12));
        System.out.println(shape.getArea());
        shape.mustFollow();
        Shape.sayCheeze();
        //static method will not come in class who is implementing it, however default method will come
        //Square.sayCheeze(); Illegal
    }
}
