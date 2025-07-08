package com.xworkz.forms.servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/laboratory")
public class LaboratoryServlet extends HttpServlet {

    public LaboratoryServlet()
    {
        System.out.println("Laboratory servlet constructor");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost method in Laboratory servlet");
        String labName=req.getParameter("labName");
        String technicianName=req.getParameter("techName");
        String testName=req.getParameter("testName");
        String testDate=req.getParameter("testDate");
        String result=req.getParameter("result");

        RequestDispatcher requestDispatcher=req.getRequestDispatcher("LaboratorySuccess.jsp");
        req.setAttribute("labName",labName);
        req.setAttribute("technicianName",technicianName);
        req.setAttribute("testName",testName);
        req.setAttribute("testDate",testDate);
        req.setAttribute("result",result);
        requestDispatcher.forward(req,resp);
    }
}