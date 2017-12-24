package com.devrajs.java8.SAM;

import java.util.function.Predicate;

/*
SAM is single abstract method like Predicate, Condition etc
 */
public class PredicateDemo {
    /*
    Predicate lets you create one condition and use that condition for some evaluation
     */
    public static void checkLength()
    {
        Predicate<String> longlengthChecker = s -> (s.length() > 10);
        Predicate<String> shortlengthChecker = s -> (s.length() < 5);

        String val1 = "helkjkkkskkdjjl";
        String val2 = "he";
        String val3 = "helkjk";
        String val4 = "jjl";

        if(longlengthChecker.test(val1))
        {
            System.out.println(val1 + " is very long");
        }
        else if(shortlengthChecker.test(val1))
        {
            System.out.println(val1 + " is very short");
        }
        if(longlengthChecker.test(val2))
        {
            System.out.println(val2 + " is very long");
        }
        else if(shortlengthChecker.test(val2))
        {
            System.out.println(val2 + " is very short");
        }
        if(longlengthChecker.test(val3))
        {
            System.out.println(val3 + " is very long");
        }
        else if(shortlengthChecker.test(val3))
        {
            System.out.println(val3 + " is very short");
        }
        if(longlengthChecker.test(val4))
        {
            System.out.println(val4 + " is very long");
        }
        else if(shortlengthChecker.test(val4))
        {
            System.out.println(val4 + " is very short");
        }
    }

    public static void checkLengthNegateApi()
    {
        Predicate<String> longlengthChecker = s -> (s.length() > 10);
        Predicate<String> shortlengthChecker = s -> (s.length() < 5);
        //Predicate.negate will return predicate which check exact reverse of original predicate

        String val1 = "helkjkkkskkdjjl";
        String val2 = "he";

        if(longlengthChecker.negate().test(val1))
        {
            System.out.println(val1 + " is short that 10");
        }
        else
        {
            System.out.println(val1 + " is longer that 10");
        }
        if(longlengthChecker.negate().test(val2))
        {
            System.out.println(val2 + " is short that 10");
        }
        else
        {
            System.out.println(val2 + " is longer that 10");
        }

    }

    public static void main(String[] args) {
        checkLengthNegateApi();
    }
}
