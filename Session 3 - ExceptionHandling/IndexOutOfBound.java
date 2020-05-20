package com.upGrad;

public class IndexOutOfBound {
    public  void printElement(){
        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        //put your code here
        for(int i : arr)
            System.out.println(i);
    }

    public static void main(String[] args){
        IndexOutOfBound i = new IndexOutOfBound();
        i.printElement();
    }
}
