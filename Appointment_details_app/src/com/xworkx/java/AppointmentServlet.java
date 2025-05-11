package com.xworkx.java;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/details")
public class AppointmentServlet extends GenericServlet {
    public AppointmentServlet (){
        System.out.println("AppointmentServlet  running in tomcat");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("running service in AppointmentServlet");

        String firstname=servletRequest.getParameter("firstname");

        String lastname=servletRequest.getParameter("lastname");

        String email=servletRequest.getParameter("email");

        String age=servletRequest.getParameter("age");

        String gender=servletRequest.getParameter("gender");

        String address=servletRequest.getParameter("address");

        String sickness=servletRequest.getParameter("sickness");

        String mobileno=servletRequest.getParameter("mobileno");
        long contact=0L;
        if(mobileno!=null && mobileno!=""){
            contact=Long.parseLong(mobileno);
        }
        servletResponse.setContentType("text/html");
        PrintWriter writer= servletResponse.getWriter();

        writer.println("<h1> Thanks for booking a slot </h1>");
    }
}
