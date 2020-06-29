package com.upgrad.DAO;

import com.upgrad.beans.Account;
import com.upgrad.exceptions.AccountDetailsNotFoundException;

public interface AccountDAO {
    public Account acceptAccountDetails(Account account) ;
    public Account getAccountDetails(int accountNumber) throws AccountDetailsNotFoundException;
    public Account updateAccountDetails(Account account) throws AccountDetailsNotFoundException;
}
