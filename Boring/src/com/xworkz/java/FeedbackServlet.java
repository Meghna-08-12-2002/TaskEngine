package com.xworkz.java;

import javax.servlet.*;
import java.io.IOException;

public class FeedbackServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name=servletRequest.getParameter("n");
        String college=servletRequest.getParameter("c");
        String webcourse=servletRequest.getParameter("cou");
        String knowl=servletRequest.getParameter("k");

        System.out.println(name);
        System.out.println(college);
        System.out.println(webcourse);
        System.out.println(knowl);


        RequestDispatcher requestDispatcher=servletRequest.getRequestDispatcher("SuccessFeedback.jsp");
        requestDispatcher.forward(servletRequest,servletResponse);
    }
}
