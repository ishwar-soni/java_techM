package com.upGrad;

import java.io.FileReader;
import java.io.IOException;

public class CheckedUncheckedExercise {
    //handle the possible exception here
    public void readElement(){
        int[] arr = new int[5];
        try{
            int a = arr[5];
            System.out.println("Last element is  :" + a);
        }catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("trying to access outside of array");
        }
    }

    public void readingDataFromFile(){
        try{
            FileReader file = new FileReader("file2.txt");
            file = null;
            file.read();
        }catch (NullPointerException e) {
            System.out.println("We are trying to refer null reference");
        } catch (IOException e) {
            System.out.println("Either file not present or not able to read.");
        }
    }
}
