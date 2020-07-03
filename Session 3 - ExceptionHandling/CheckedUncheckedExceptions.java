package com.upGrad;

import java.io.*;

public class ReadData {
    //checkedExceptions
    public static void readDataFromFile(){
        try {
            FileReader fileReader = new FileReader("File1.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    //uncheckedExceptions
    public static int calculateEMIAmount(int totalAmount, int months){
        //we will add emi calculation functionality here
        int emiAmount = 0;
        try{
            emiAmount = totalAmount/months;  //passing months as 0 , will throw ArithmeticException which is not checked here.
        }catch (NullPoiterException ae){
            System.out.println("Number of months can't be less than 1");
        }
        return emiAmount;
    }
}
