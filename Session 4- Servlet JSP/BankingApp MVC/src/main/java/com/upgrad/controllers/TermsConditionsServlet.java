package com.upgrad.controllers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TermsConditionsServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1> Please read the following terms and conditions </h1>");
        out.println("<h2> 1. Same person cant have multiple accounts </h2>");
        out.println("<h2> 2. Government ID card is necessary </h2>");
        out.println("<h2> 3. For zero balance account, yearly fees will be mandatory </h2>");
        out.println("<h2> 4. For credit cards, PAN will be mandatory. </h2>");
        out.flush();
    }
}