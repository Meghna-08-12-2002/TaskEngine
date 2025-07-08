package com.xworkz.java;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(urlPatterns = "/details")
public class CompanyServlet extends GenericServlet {
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        String empName = request.getParameter("empName");
        String empId = request.getParameter("empId");
        String department = request.getParameter("department");
        String salaryStr = request.getParameter("salary");
        double salary = 0;

        if (salaryStr != null && !salaryStr.isEmpty()) {
            salary = Double.parseDouble(salaryStr);
        }
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        System.out.println("<html><body>");
        out.println("<h1>Thank you for Booking"!</h1>");
        System.out.println("<h1>Employee Details</h1>");
        System.out.println("<p>Name: " + empName + "</p>");
        System.out.println("<p>ID: " + empId + "</p>");
        System.out.println("<p>Department: " + department + "</p>");
        System.out.println("<p>Salary: " + salary + "</p>");
        System.out.println("</body></html>");
    }
}
