package com.devrajs.java8.defaultAndStaticMethodInInterface;

public interface ShapeHavingSameDefaultName {

    default void mustFollow()
    {
        System.out.println("All men must die!!");
    }
}
