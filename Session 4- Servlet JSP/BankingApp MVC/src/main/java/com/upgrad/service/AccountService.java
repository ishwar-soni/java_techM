package com.upgrad.service;

import com.upgrad.beans.Account;
import com.upgrad.exceptions.AccountDetailsNotFoundException;

public interface AccountService {
    public Account acceptAccountDetails(Account account) ;
    public Account getAccountDetails(int accountNumber, int pin) throws AccountDetailsNotFoundException;
    public Account depositAmount(int accountNumber, int amount) throws AccountDetailsNotFoundException;
    public Account withdrawAmount(int accountNumber, int pin, int amount) throws AccountDetailsNotFoundException;
}
