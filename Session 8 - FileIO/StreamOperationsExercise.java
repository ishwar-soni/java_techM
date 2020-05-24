package com.upGrad;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamOperationsExercise {
    public static void mapObjects(){
        List<Integer> list = Arrays.asList(3, 6, 9, 12, 15);
        //convert the following objects to their respective squares
    }

    public static void filterStream(){
        List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);
        //find the numbers which are divisible by 3 and 2
    }

    public static void sortStream(){
        // Creating a list of integers
        List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);
        //sort the list
    }

    public static void forEachStream(){
        List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);
        //print all the numbers after multiplying them with 2
    }

    public static void reduceStream(){
        // Creating list of integers
        List<Integer> array = Arrays.asList(-2, 0, 4, 6, 8);
        // Find max of all element
    }

    public static void main(String[] args){
        reduceStream();
    }
}
