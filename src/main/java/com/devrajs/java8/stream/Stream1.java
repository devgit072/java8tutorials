package com.devrajs.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {

    private static void how_to_make_stream()
    {
        List<String> list = Arrays.asList("hell", "jj", "hhhhsl");
        //two way to make stream
        //1st way
        list.stream().forEach(s-> System.out.println(s));
        //2nd way
        Stream.of(list).forEach(s-> System.out.println(s));
    }
    /*
    Also remember, stream doesn't modify data or store data some where...its just take list and do operation on it.
     */
    private static void operationOnStream()
    {
        List<String> list = Arrays.asList("hell", "jj", "hhhhsl", "jack", "harry", "harry", "jack");
        list.stream().distinct().forEach(s-> System.out.print(s+"  "));
        boolean allVarGreatherThan2 = list.stream().allMatch(s-> s.length() > 1);
        System.out.println("all Var Greather Than 2: " + allVarGreatherThan2);
        boolean allVarGreatherThan3 = list.stream().allMatch(s-> s.length() > 3);
        System.out.println("all Var Greather Than 3: " + allVarGreatherThan3);
        List<String> listStartWith_h = list.stream().filter(s->s.startsWith("h")).collect(Collectors.toList());
        System.out.println("here");
        listStartWith_h.forEach(s-> System.out.println(s));

        list.stream().map(s->s.length());
    }

    public static void main(String[] args) {
        operationOnStream();
    }
}
