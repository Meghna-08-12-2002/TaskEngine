package com.xworkz;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/match",loadOnStartup = 2)
public class CricketServlet extends GenericServlet {
    public CricketServlet() {
        System.out.println("CricketServlet running in Tomcat....");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("running service in  CricketServlet");
    }
}
