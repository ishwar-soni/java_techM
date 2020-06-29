package com.upgrad.controllers;


import com.upgrad.DAO.AccountDAO;
import com.upgrad.DAO.AccountDAOImpl;
import com.upgrad.beans.Account;
import com.upgrad.service.AccountService;
import com.upgrad.service.AccountServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/AccountServlet")
public class AccountServlet extends HttpServlet {
    AccountDAO accountDAO = new AccountDAOImpl();
    AccountService accountService = new AccountServiceImpl(accountDAO);
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String accountHolderName = request.getParameter("name");
        int accountNumber = Integer.parseInt(request.getParameter("accountNumber"));
        int pin = Integer.parseInt(request.getParameter("pin"));
        int balance = Integer.parseInt(request.getParameter("currentBalance"));
        Account newAccount = new Account(accountHolderName,accountNumber,balance,pin);
        Account savedAccount = accountService.acceptAccountDetails(newAccount);
        out.println("<h1> Congratulations, your acccount has been created </h1>");
        out.println("<h2> 1. Account holder name " + savedAccount.getAccountHolderName() + "</h2>");
        out.println("<h2> 2. Account number " + savedAccount.getAccountNumber() + "</h2>");
        out.println("<h2> 3. Account pin " + savedAccount.getPin() + "</h2>");
        out.println("<h2> 4. Account balance " + savedAccount.getCurrentBalance() + "</h2>");
        out.flush();
    }
}