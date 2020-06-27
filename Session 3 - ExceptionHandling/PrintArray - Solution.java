package com.upGrad;

public class PrintArray {
    public  void printElement(){
        try{
            int[] arr = new int[4];
            arr[0] = 1;
            arr[1] = 2;
            arr[2] = 3;
            arr[3] = 4;
            arr[4] = 5;
            //put your code here
            for(int i : arr)
                System.out.println(i);
        }catch(IndexOutOfBoundsException ie){
            System.out.println("we are trying to access index out of array size");
        }
    }

    public static void main(String[] args){
        PrintArray i = new PrintArray();
        i.printElement();
    }
}
