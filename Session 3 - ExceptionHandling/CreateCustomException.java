package com.upGrad;

public class AccountDAOImpl {
   //other methods and fields
    public Account getAccountDetails(int accountNumber) throws Exception {
        Account account = null;
        for(Account acc : accounts){
            if(acc.getAccountNumber() == accountNumber ){
                return acc;
            }
        }
        System.out.println("Account for the given number does not exist");
        throw new AccountDetailsNotFoundException("Account details not found for accoutNumber: "+ accountNumber);
    }
}

    //creating CustomException

public class AccountDetailsNotFoundException extends Exception {
    public AccountDetailsNotFoundException() {
    }

    public AccountDetailsNotFoundException(String message) {
        super(message);
    }

    public AccountDetailsNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccountDetailsNotFoundException(Throwable cause) {
        super(cause);
    }

    public AccountDetailsNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
