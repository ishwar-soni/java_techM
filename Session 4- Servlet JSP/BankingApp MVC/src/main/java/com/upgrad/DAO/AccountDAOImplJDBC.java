package com.upgrad.DAO;

import com.upgrad.beans.Account;
import com.upgrad.exceptions.AccountDetailsNotFoundException;
import com.upgrad.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDAOImplJDBC implements AccountDAO{


    @Override
    public Account acceptAccountDetails(Account account) {
       /* String INSERT_SQL = "INSERT INTO ACCOUNT "
                + " (ACCOUNTNUMBER, PIN, CURRENTBALANCE, ACCOUNTNAME) VALUES "
                + " (?, ?, ? ,?);";*/
        String INSERT_SQL = "INSERT INTO ACCOUNT VALUES  (?, ?, ? ,?)";
        int result = 0;

        try {
            Connection connection = JDBCUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_SQL);
            preparedStatement.setString(1, Integer.toString(account.getAccountNumber()));
            preparedStatement.setString(2, Integer.toString(account.getPin()));
            preparedStatement.setString(3, Integer.toString(account.getCurrentBalance()));
            preparedStatement.setString(4, account.getAccountHolderName());
            System.out.println(preparedStatement);
            result = preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Result" + result);

        return account;
    }

    @Override
    public Account getAccountDetails(int accountNumber) throws AccountDetailsNotFoundException {
        /*String INSERT_SQL = "select * from ACCOUNT where ACCOUNTNUMBER = ? ";
        int result = 0;

        try(Connection connection = JDBCUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_SQL);
            preparedStatement.setString(1, Integer.toString(accountNumber));
            System.out.println(preparedStatement);
             result = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Result" + result);
        return ;*/
        return null;
    }

    @Override
    public Account updateAccountDetails(Account account) throws AccountDetailsNotFoundException {
        return null;
    }
}
