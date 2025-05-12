package com.xworkz.java;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/contact",loadOnStartup = 1)
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

        writer.println("<h1> Thanks for Contact Details </h1>");
        System.out.println("firstname:"+firstname);
        System.out.println("lastname:"+lastname);
        System.out.println("email:"+email);
        System.out.println("message:"+message);

    }
}
