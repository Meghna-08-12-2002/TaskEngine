package com.xworkz.java.handwash.servlet;

import com.xworkz.java.handwash.dto.HandwashDto;
import com.xworkz.java.handwash.service.HandwashService;
import com.xworkz.java.handwash.service.HandwashServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

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
        System.out.println("Result:"+saved);
        RequestDispatcher requestDispatcher;
        if(saved){
            requestDispatcher=req.getRequestDispatcher("Sucess.jsp");
            req.setAttribute("message", "Save Success");
            req.setAttribute("handwashDto", handwashDto);
        } else {
            requestDispatcher=req.getRequestDispatcher("handwash.jsp");
            req.setAttribute("message","Details Incorrect");
            req.setAttribute("handwashDto",handwashDto);
        }
        requestDispatcher.forward(req,resp);
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet method in Handwash servlet");
        String handwashIdStr=req.getParameter("handwashId");
        if(handwashIdStr!= null)
        {
            int handwashId=Integer.parseInt(handwashIdStr);
            System.out.println("search Handwashid :"+handwashId);
            HandwashService handwashService=new HandwashServiceImpl();
            Optional<HandwashDto> optionalHandwashDto= handwashService.findById(handwashId);
            if(optionalHandwashDto.isPresent()){
                System.out.println("Handwash Id is found");
            }
            else {
                System.out.println("Handwash Id is not found");
            }
        }
    }
}
