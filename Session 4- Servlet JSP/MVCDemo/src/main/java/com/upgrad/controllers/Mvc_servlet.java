package com.upgrad.controllers;

import com.upgrad.beans.TestBean;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Mvc_servlet
 */
public class Mvc_servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Mvc_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        String email=request.getParameter("email");
        String password=request.getParameter("password");

        TestBean testobj = new TestBean();
        testobj.setEmail(email);
        testobj.setPassword(password);
        request.setAttribute("testBean",testobj);
        RequestDispatcher rd=request.getRequestDispatcher("mvc_success.jsp");
        rd.forward(request, response);
    }

}
