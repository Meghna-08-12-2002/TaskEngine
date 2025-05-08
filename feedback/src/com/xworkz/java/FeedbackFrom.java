package com.xworkz.java;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/request")
public class FeedbackFrom extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Service running in Feedbackfrom");
        String name=servletRequest.getParameter("name");
        String email=servletRequest.getParameter("email");
        String contactnumber=servletRequest.getParameter("contactnumber");
        String feedback=servletRequest.getParameter("feedback");
        System.out.println("name:"+name);
        System.out.println("email:"+email);
        System.out.println("contactnumber:"+contactnumber);
        System.out.println("feedback:"+feedback);

        servletResponse.setContentType("text/html");
        PrintWriter writer= servletResponse.getWriter();
        writer.println(name+" Thanks for the feed back");



    }
}
