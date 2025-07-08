package com.xworkz.java;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/book")
public class BookingServlet extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("running service in MovieBookingServlet");

        String name=servletRequest.getParameter("name");

        String contactNumber=servletRequest.getParameter("contactnumber");
        long contact=0L;
        if(contactNumber!=null && contactNumber!=""){
            contact=Long.parseLong(contactNumber);
        }

        String moviename=servletRequest.getParameter("moviename");

        String tprice=servletRequest.getParameter("ticketprice");
        int price=0;
        if(tprice!=null && tprice!=""){
            price=Integer.parseInt(tprice);

        }

        String numofTickets=servletRequest.getParameter("numberoftickets");
        int tickets=0;
        if(numofTickets!=null && numofTickets!=""){
            tickets=Integer.parseInt(numofTickets);
        }



        long payableAmount=price*tickets;

        servletResponse.setContentType("text/html");
        PrintWriter writer= servletResponse.getWriter();

        writer.println("<h1> Thanks for booking a movie </h1>");
        writer.println("<h2> Your payable Amount is</h2>"+payableAmount);

    }
}