package com.upGrad;

public class EMICalculator {
    //in case we provie 0 months for emi calculation , how can we  use throw and throws 
    public static void calculateEMIAmount(int totalAmount, int months) throws Exception{
        int emiAmount = 0;
        if(months <= 0){
            throw new Exception("Number of months cant be less than 1");
        }else{
            emiAmount = totalAmount/months;
            System.out.println("Emi amount : " + emiAmount);
        }
    }
}
