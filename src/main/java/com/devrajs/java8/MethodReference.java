package com.devrajs.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MethodReference {
    /*
    Any class having static method can be replaced with method reference
    ClassName::staticMethod
     */

    private static void demoOfMethodRef()
    {
        List<String> stringList = Arrays.asList("Harry1", "Tommy1", "Nova1", "Jack1", "Arrra1" , "Miami1");
        List<String> stringList2 = Arrays.asList("Harry2", "Tommy2", "Nova2", "Jack2", "Arrra2" , "Miami2");
        List<String> stringList3 = Arrays.asList("Harry3", "Tommy3", "Nova3", "Jack3", "Arrra3" , "Miami3");
        //old java way
        stringList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        //new java 8 lambda way
        stringList2.sort( (s1, s2) -> s1.compareTo(s2));
        stringList3.sort(String::compareTo);//method reference because String already has static method compareTo

        stringList.forEach(System.out::println);// here println is static method of inner class out of outer class System, so can be method referenced
    }

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        Long l = 60*60*365*24*1000L;
        System.out.println(l);
        System.out.println(Long.MAX_VALUE);
    }
}
