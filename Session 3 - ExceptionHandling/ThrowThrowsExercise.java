package com.upGrad;

public class BankServices {
    //in case we provie 0 months for emi calculation , how can we  use throw and throws 
    public static void calculateEMIAmount(int totalAmount, int months){
        int emiAmount = 0;
        emiAmount = totalAmount/months;
        System.out.println("Emi amount : " + emiAmount);
    }
}
