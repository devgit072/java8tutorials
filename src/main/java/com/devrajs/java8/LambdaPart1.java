package com.devrajs.java8;

//import java.awt.*;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaPart1 {
    /*
    Basic syntax of lambda
    (param1, param2) -> {body of functions, what it will do with those params}

    It can be without params also
    () -> {print something}

    In Lambda world , functions can be passed as parameter to another functions
    */

    /*
    Lambda with specially helpful with concise syntax in case of anoymous class with single method
     */
    public static void lambda1()
    {
        //Old way
        Button button = new Button();
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doSomethingWith(e);
            }
        });

        //new way in lamda world
        button.addActionListener(e -> doSomethingWith(e));
        /*
         It is method reference  className::methodName , jvm will automatically do the rest of the things like identifying the types of paramter
         and passing to methods
         */
        button.addActionListener(LambdaPart1::doSomethingWith);

    }
    public static void sortStringsArray()
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
        stringList3.sort(String::compareTo);//method reference because String already has method compareTo

        //now print both
        for(String str : stringList)
        {
            System.out.println(str);
        }
        //now print both
        System.out.println();
        for(String str : stringList2)
        {
            System.out.println(str);
        }
        System.out.println();
        for(String str : stringList3)
        {
            System.out.println(str);
        }

    }
    private static void doSomethingWith(ActionEvent e)
    {
         //do something
    }

    /*
    Okay...so where we can think to use lambda???????
    Simple one liner is to replacement of variable of one method of interface/abstract class
    Example:
    public interface Lala {
       String doSomeThing(String a);// this is only method
    }
    Now some method uses variable of that interface Lala
    otherMethod(lala) {do with lala}
    can be replaced as
    otherMethod( s -> s.upperCase();)  , dosomething in Lala takes String , so here in lambda it will be string
     */

    public static void main(String[] args) {
        sortStringsArray();
    }
}
