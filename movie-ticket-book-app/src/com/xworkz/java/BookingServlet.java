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
        // Get form parameters
        String name = servletRequest.getParameter("name");
        String contactnumber = servletRequest.getParameter("contactnumber");
        long c_number = 0;

        if (contactnumber != null && contactnumber=="") {
            c_number = Long.parseLong(contactnumber);
        }

        String moviename = servletRequest.getParameter("moviename");
        String ticketprice = servletRequest.getParameter("ticketprice");
        int t_price = 0;

        if (ticketprice != null && ticketprice=="") {
            t_price = Integer.parseInt(ticketprice);
        }

        String numberoftickets = servletRequest.getParameter("numberoftickets");
        int num_tickets = 0;

        if (numberoftickets != null && numberoftickets=="") {
            num_tickets = Integer.parseInt(numberoftickets);
        }

        int payableamount = t_price * num_tickets;
        PrintWriter out = servletResponse.getWriter();
        servletResponse.setContentType("text/html");
        out.println("<html><body>");
        out.println("<h1>Thank you for Booking, " + name + "!</h1>");
        out.println("<h2>Total Price: " + payableamount + "</h2>");
        out.println("</body></html>");
    }
}
