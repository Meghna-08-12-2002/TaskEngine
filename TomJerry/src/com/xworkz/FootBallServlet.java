package com.xworkz;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/ball",loadOnStartup = 7)
public class FootBallServlet extends GenericServlet {
    public FootBallServlet(){
        System.out.println("FootBall running in tomcat.............");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("running service in FootBallServlet");
    }
}
