package com.devrajs.java8.SAM;

import java.util.function.Function;

public class FunctionDemo {

    private static void functionDemo()
    {
        Function<String, Integer> getLength = s -> s.length();
        Function<String, String> getUpperCase = String::toUpperCase;

        System.out.println(getLength.apply("hello"));
        System.out.println(getUpperCase.apply("hello"));
    }

    public static void main(String[] args) {
        functionDemo();
    }
}
