package com.upGrad;

import java.util.*;
import java.util.stream.Collectors;

public class StreamOperations {
    public static void mapObjects(){
        List<Integer> list = Arrays.asList(3, 6, 9, 12, 15);
        list.stream().map(number -> number * 3).forEach(System.out::println);
        System.out.println(list);
    }

    public static void filterStream(){
        // Creating a list of Integers
        List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);
        // Using Stream filter(Predicate predicate)
        // to get a stream consisting of the
        // elements that are divisible by 5
        list.stream().filter(num -> num % 2 == 0).forEach(System.out::println);
    }

    public static void sortStream(){
        // Creating a list of integers
        List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);
        System.out.println("The sorted stream is : ");
        // displaying the stream with elements
        // sorted in natural order
        list.stream().sorted().forEach(System.out::println);
    }

    public static void forEachStream(){
        // Creating a list of Integers
        List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);
        // Using forEach(Consumer action) to
        // print the elements of stream
        // in reverse order
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

    public static void reduceStream(){
        // Creating list of integers
        List<Integer> array = Arrays.asList(-2, 0, 4, 6, 8);
        // Finding sum of all elements
        int sum = array.stream().reduce(0,
                (num1, num2) -> num1 + num2);
        // Displaying sum of all elements
        System.out.println("The sum of all numbers is " + sum);
    }

    public static void main(String[] args){
        reduceStream();
    }
}
