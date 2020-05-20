package com.upGrad;

public class ExceptionHandlingTryCatch {
    public int divideTwoNumber(int a, int b){
        int res = a/b;
        return res;
    }

    public void getStringLength(String str){
        int len = str.length();
        System.out.println("The length of the string is :" + str.length());
    }

    public int divideTwoNumberWithExceptionHandling(int a, int b){
        int res = 0;
        try{
            res = a/b;
            return res;
        }catch (ArithmeticException e){
            System.out.println("Exception has been caught");
        }
        return res;
    }

    public void getStringLengthWithExceptionHandling(String str){
        try {
            int len = str.length();
        }catch (NullPointerException e){
            System.out.println("Exception has been caught");
        }
        System.out.println("The length of the string is :" + str.length());
    }
}
