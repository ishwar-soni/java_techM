package com.upGrad;
class Account{
    int totalAmount=10000;

    synchronized void withdraw(int amount){
        System.out.println("Withdraw Amount : " + amount);
        if(this.totalAmount<amount){
            System.out.println("Available balance is less than amount");
            try{
                wait();
            }catch(Exception e){
                System.out.println("Exception while withdrawing");
            }
        }
        this.totalAmount -=amount;
        System.out.println("Withdraw Done, final amount : " + this.totalAmount);
    }
    synchronized void deposit(int amount){
        System.out.println("Deposit amount : " + amount );
        this.totalAmount+=amount;
        System.out.println("Deposit completed, final amount : " + this.totalAmount);
        notify();
    }
}
public class InterThreadCommunication {
    public static void main(String[] args){
        final Account a =new Account();
        System.out.println("Current balance :" + a.totalAmount);
        new Thread(){
            public void run(){a.withdraw(15000);}
        }.start();
        new Thread(){
            public void run(){a.deposit(10000);}
        }.start();
    }
}


