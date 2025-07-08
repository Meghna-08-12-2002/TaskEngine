package com.xworkz.java;

import javax.servlet.*;
import java.io.IOException;

public class LaborotaryServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String pname=servletRequest.getParameter("name");
        String age=servletRequest.getParameter("age");
        String bg=servletRequest.getParameter("g");
        String bp=servletRequest.getParameter("p");


        System.out.println(pname);
        System.out.println(age);
        System.out.println(bg);
        System.out.println(bp);


        RequestDispatcher requestDispatcher=servletRequest.getRequestDispatcher("SuccessLaboratory.jsp");
        requestDispatcher.forward(servletRequest,servletResponse);
    }
}
