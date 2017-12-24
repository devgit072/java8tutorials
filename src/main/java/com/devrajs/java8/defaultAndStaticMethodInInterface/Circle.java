package com.devrajs.java8.defaultAndStaticMethodInInterface;

public class Circle implements Shape {

    private double area;
    @Override
    public double calculateArea(double shapeSize) {
        area = 3.14 * shapeSize * shapeSize;
        return area;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public void mustFollow() {
        System.out.println("valar dohairas!!");
    }

    public static void main(String[] args) {
        Shape shape = new Circle();
        System.out.println(shape.calculateArea(4));
        System.out.println(shape.getArea());

        shape.mustFollow();
        Shape.sayCheeze();
    }
}
