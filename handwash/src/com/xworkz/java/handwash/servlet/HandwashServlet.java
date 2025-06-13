package com.xworkz.java.handwash.servlet;

import com.xworkz.java.handwash.dto.HandwashDto;
import com.xworkz.java.handwash.service.HandwashServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/handwash")
public class HandwashServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         String date=req.getParameter("date");
         int count=Integer.parseInt(req.getParameter("count"));
         boolean soapUsed=Boolean.parseBoolean(req.getParameter("soapUsed"));;
         String location=req.getParameter("location");
         int duration=Integer.parseInt(req.getParameter("duration"));
         String remarks=req.getParameter("remarks");

        HandwashDto handwashDto=new HandwashDto();
        handwashDto.setDate(date);
        handwashDto.setCount(count);
        handwashDto.setSoapUsed(soapUsed);
        handwashDto.setLocation(location);
        handwashDto.setDuration(duration);
        handwashDto.setRemarks(remarks);
        HandwashServiceImpl handwashService=new HandwashServiceImpl();
        boolean saved=handwashService.save(handwashDto);
        if(saved){
            System.out.println("Successfully saved the information.");
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("Sucess.jsp");
            req.setAttribute("message", "Save Success");
            req.setAttribute("productDto", handwashDto);
            requestDispatcher.forward(req,resp);

        } else {
            System.out.println(" Error in saving the information.");
        }
    }
}
