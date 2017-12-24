package com.devrajs.java8.defaultAndStaticMethodInInterface;

public interface Shape {
    double calculateArea(double shapeSize);
    double getArea();

    /*
    In java 8 , they have allowed default and static method . Earlier they were not available
     */
    static void sayCheeze()
    {
        System.out.println("Cheeze!!");
    }
    default void mustFollow()
    {
        System.out.println("All men must die!!");
    }
}
