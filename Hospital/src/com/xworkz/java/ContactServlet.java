package com.xworkz.java;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "contact",loadOnStartup = 2)
public class ContactServlet extends GenericServlet {
    public ContactServlet(){
        System.out.println("ContactServlet running in tomcat");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("running service in ContactServlet");

        String firstname=servletRequest.getParameter("firstname");

        String lastname=servletRequest.getParameter("lastname");

        String email=servletRequest.getParameter("email");

        String message=servletRequest.getParameter("message");

        servletResponse.setContentType("text/html");
        PrintWriter writer= servletResponse.getWriter();
        if (email == null || email.trim().isEmpty()) {
            writer.println("<h2 style='color:red;'>Email is required. Please enter a valid email.</h2>");
            return;
        }
        writer.println("<h1> Thanks for Contact Details </h1>");


    }
}
