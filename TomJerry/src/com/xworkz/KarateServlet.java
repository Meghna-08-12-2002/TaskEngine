package com.xworkz;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/indoor",loadOnStartup = 9)
public class KarateServlet extends GenericServlet {
    public KarateServlet(){
        System.out.println("KarateServlet running in Tomcat....");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("running service in KarateServlet");
    }
}
