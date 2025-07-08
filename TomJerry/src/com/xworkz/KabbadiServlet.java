package com.xworkz;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/outdoor",loadOnStartup = 8)
public class KabbadiServlet extends GenericServlet {
    public KabbadiServlet(){
        System.out.println("KabbadiServlet running in tomcat...");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("running service in kabbadiservlet");
    }
}
