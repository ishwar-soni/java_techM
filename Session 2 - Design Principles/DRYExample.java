package com.upGrad;

public class DRYExample {
    public static int getFinalAmount(int rate, int time, int principal){
        int interest = rate * time * principal;
        int total = principal + interest;
        return total;
    }

    public static double calculateLateFine(int rate, int time, int principal){
        int interest = rate * time * principal;
        int total = principal + interest;
        double lateFine = 0.1 * total;
        return lateFine;
    }

    public static double calculateEarlyClosingFees(int rate, int time, int principal, int amountPaid){
        int interst = rate * time * principal;
        int total = principal + interst;
        int remainAmount = total - amountPaid;
        double closingFee = remainAmount + ( 0.1 * interst);
        return closingFee;
    }
}
