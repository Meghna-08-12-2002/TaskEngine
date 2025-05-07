package com.xworkz;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/badminton",loadOnStartup = 4)
public class BadmintonServlet extends GenericServlet {
    public BadmintonServlet(){
        System.out.println("BadmintonServlet in Tomcat........");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("running sercvice in BadmintonServlet");
    }
}
