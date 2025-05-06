package com.xworkz.Jerry.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/send",loadOnStartup = 1)
public class Jerry extends GenericServlet {
public Jerry(){
    System.out.println("running in servlet");
}

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
System.out.println("running in service");
    }
}
