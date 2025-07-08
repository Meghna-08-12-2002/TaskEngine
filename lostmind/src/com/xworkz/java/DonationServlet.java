package com.xworkz.java;

import dto.DonationDto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/donationAct")
public class DonationServlet extends HttpServlet {
    public DonationServlet() {
        System.out.println("DonationServlet running in tomcat");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String amountStr = req.getParameter("amount");
        String message = req.getParameter("message");

        int amount = 0;
        try {
            amount = Integer.parseInt(amountStr);
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount format");
        }

        DonationDto donation = new DonationDto();
        donation.setName(name);
        donation.setEmail(email);
        donation.setAmount(amount);
        donation.setMessage(message);

        System.out.println("Received Donation: " + donation);

        resp.setContentType("text/html");
        resp.getWriter().write("<h3>Thank you, " + name + ", for your donation of $" + amount + ".</h3>");

    }
}