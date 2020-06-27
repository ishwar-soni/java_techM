package com.upGrad;

public class CheckedUncheckedExercise {
    //handle the possible exception here
    public void readElement(){
        int[] arr = new int[5];
        try{
            int a = arr[5];
            System.out.println("Last element is  :" + a);
        }catch(NullPointerException ne){
            System.out.println("Null pointer exception is happening due to null array");
        }
    }

    public void readingDataFromFile(){
        try{
        FileReader file = new FileReader("file2.txt");
        file = null;
        file.read();
    } 
        catch (IOException e) {
        System.out.println("FileReader is not able read file from system");
    }
  }
}
