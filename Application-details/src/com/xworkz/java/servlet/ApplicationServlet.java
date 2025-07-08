package com.xworkz.java.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/app",loadOnStartup = 1)
public class ApplicationServlet extends GenericServlet {
    public ApplicationServlet(){
        System.out.println("ApplicationServlet running in tomcat");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service running in applicationservlet");
        String name = servletRequest.getParameter("name");
        String email = servletRequest.getParameter("email");
        String contact = servletRequest.getParameter("contact");
        String amount = servletRequest.getParameter("amount");

        String firNo = servletRequest.getParameter("firNo");
        String complaint = servletRequest.getParameter("complaint");
        String location = servletRequest.getParameter("location");
        String time = servletRequest.getParameter("time");

        String licenseNo = servletRequest.getParameter("licenseNo");
        String issuedDate = servletRequest.getParameter("issuedDate");
        String expiryDate = servletRequest.getParameter("expiryDate");
        String licenseType = servletRequest.getParameter("licenseType");

        String feedback = servletRequest.getParameter("feedback");
        String rating = servletRequest.getParameter("rating");
        String suggestion = servletRequest.getParameter("suggestion");
        String gender = servletRequest.getParameter("gender");

        String testName = servletRequest.getParameter("testName");
        String result = servletRequest.getParameter("result");
        String technician = servletRequest.getParameter("technician");
        String labId = servletRequest.getParameter("labId");

        RequestDispatcher requestDispatcher= servletRequest.getRequestDispatcher("sucessdetails.jsp");
        requestDispatcher.forward(servletRequest,servletResponse);



    }
}
