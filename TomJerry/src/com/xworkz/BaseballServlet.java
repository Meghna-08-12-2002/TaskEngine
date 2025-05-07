package com.xworkz;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/baseball",loadOnStartup = 5)
public class BaseballServlet extends GenericServlet {
    public BaseballServlet(){
        System.out.println("BaseballServlet running in tomCat....");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("running service in BaseballServlet");
    }
}
