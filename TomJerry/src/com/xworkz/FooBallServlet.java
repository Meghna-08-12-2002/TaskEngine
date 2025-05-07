package com.xworkz;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/fooball",loadOnStartup = 6)
public class FooBallServlet extends GenericServlet {
    public FooBallServlet(){
        System.out.println("FooBall running in tomcat....");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("running service in FooBallServlet");
    }
}
