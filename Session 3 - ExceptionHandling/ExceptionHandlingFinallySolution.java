package com.upGrad;

public class ExceptionHandlingFinally {
    int[] array = new int[5];
    public static void tryCatchFinally(){
        int[] arr = new int[5];
        try{
            for(int i=0;i<=arr.length;i++){
                System.out.println(i);
            }
        }catch(Exception ex){
            System.out.println("Exception is caught");
        }finally{
            for(int i=0;i<arr.length;i++){
                arr[i] = 0;
            }
        }
    }
}
