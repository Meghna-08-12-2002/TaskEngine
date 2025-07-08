package com.xworkz.java;

import dto.FIRDto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/fir")
public class FIRServlet extends HttpServlet {
    public FIRServlet() {
        System.out.println("FIRServlet running in tomcat");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String complainantName = req.getParameter("complainantName");
        String crimeType = req.getParameter("crimeType");
        String date = req.getParameter("date");
        String location = req.getParameter("location");

        FIRDto fir = new FIRDto();
        fir.setComplainantName(complainantName);
        fir.setCrimeType(crimeType);
        fir.setDate(date);
        fir.setLocation(location);

        System.out.println("FIR details received: " + fir);

        resp.getWriter().write("FIR submitted successfully by " + complainantName);


    }
}
