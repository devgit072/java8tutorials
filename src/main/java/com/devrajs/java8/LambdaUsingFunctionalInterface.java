package com.devrajs.java8;

public class LambdaUsingFunctionalInterface {

    public static void useFunctionalInterface()
    {
        String value1 = "This is tommy";
        otherMethod( s -> s.toUpperCase(), value1);//here interface variable is replaced as lambda and passed as paramter

    }
    public static void otherMethod(StringFunctionalInterface stringFunctionalInterface, String value)
    {
        System.out.println(stringFunctionalInterface.doSomethingWithString(value));
    }

    public static void main(String[] args) {
        useFunctionalInterface();
    }
}
