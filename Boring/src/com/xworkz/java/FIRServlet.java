package com.xworkz.java;

import javax.servlet.*;
import java.io.IOException;

public class FIRServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String pname=servletRequest.getParameter("pname");
        System.out.println(pname);

        String name=servletRequest.getParameter("name");
        System.out.println(name);
        String Complaint=servletRequest.getParameter("sub");
        System.out.println(Complaint);
        String city=servletRequest.getParameter("city");
        System.out.println(city);
        String Aadhar=servletRequest.getParameter("proof");
        System.out.println(Aadhar);


        RequestDispatcher requestDispatcher=servletRequest.getRequestDispatcher("SuccessFIR.jsp");
        requestDispatcher.forward(servletRequest,servletResponse);
    }
}
