class Account{
    private String accountHolderName; //account holder's name
    private int accountNumber; // account number
    private int pin ; // pin number
    private int currentBalance ; // current balance of account


    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

}

class AccountServiceImpl{
    public Account depositAmount(int accountNumber, int amount){
        //code logic to deposit money in account
        return null;
    }

    public Account withdrawAmount(int accountNumber, int pin , int amount){
        //code logic to withdraw money from account
        return null;
    }
}

class AccountDAOImpl{
    public Account saveAccountDetailsToDatabase(Account account){
        //code logic to save data to database 
        return null;
    }

    public Account getAccountDetailsFromDatabase(int accountNumber){
        //code logic to save data to database 
        return null;
    }

}