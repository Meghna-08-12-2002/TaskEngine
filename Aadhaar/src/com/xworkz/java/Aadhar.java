package com.xworkz.java;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns ="/valid")
public class Aadhar extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Aadhar number is recived in service method");
        String num = servletRequest.getParameter("number");

        servletResponse.setContentType("text/html");
        PrintWriter writer = servletResponse.getWriter();


        if (num != null && num.length() == 12) {
            System.out.println("Given Aadhar number is valid");
            writer.println(  num + " is a valid Aadhar number");
        } else {
            System.out.println("Given Aadhar number is not valid");
            writer.println( num + " is not a valid Aadhar number");

        }
    }
}