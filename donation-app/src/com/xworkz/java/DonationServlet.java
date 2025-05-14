package com.xworkz.java;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(urlPatterns = "/donation" ,loadOnStartup = 1)
public class DonationServlet extends GenericServlet {
    public DonationServlet(){
        System.out.println("DonationServlet running in tomcat");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service running in DonationServlet");
        String name=servletRequest.getParameter("name");

        String amount=servletRequest.getParameter("amount");
        String cause=servletRequest.getParameter("cause");

        String email=servletRequest.getParameter("email");



        servletResponse.setContentType("text/html");
        PrintWriter writer= servletResponse.getWriter();

        writer.println("<h1> Thanks for Donar Details </h1>");
        writer.println("name:"+name+"<br><br>");
        writer.println("amount:"+amount+"<br><br>");
        writer.println("cause:"+cause+"<br><br>");
        writer.println("email:"+email+"<br><br>");

    }
}
