package com.devrajs.java8.defaultAndStaticMethodInInterface;

public class Implementing implements Shape, ShapeHavingSameDefaultName {
    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double calculateArea(double shapeSize) {
        return 0;
    }

    //You must define your own version of mustFollow() because two interface that you implemented have same name method
    @Override
    public void mustFollow() {
        System.out.println("Forced to implement own version");
    }
}
