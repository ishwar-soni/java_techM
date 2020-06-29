package com.upGrad;
class AccountServiceImpl{
    //other methods and fields 
public Account getAccountDetails(int accountNumber, int pin) throws Exception {
        Account myAccount = accountDAO.getAccountDetails(accountNumber);
        if (myAccount == null) {
            System.out.println("Account does not exists");
            return null;
        } else {
            if (myAccount.getPin() == pin) {
              /*  System.out.println("Details are correct : login to account");
                return myAccount;*/
              throw new Exception("Account Not Found Exception");
            } else {
                System.out.println("Incorrect pin ");
                return null;
            }
        }
    }
 }
    //other methods and fields 
}
