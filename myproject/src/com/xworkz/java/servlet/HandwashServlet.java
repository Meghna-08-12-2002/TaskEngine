package com.xworkz.java.servlet;

import com.xworkz.java.dto.HandwashDto;
import com.xworkz.java.service.HandwashService;
import com.xworkz.java.service.HandwashServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Optional;

@WebServlet(urlPatterns = {"/handwash", "/find"}, loadOnStartup = 1)
public class HandwashServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running doPost in HandwashServlet...");

        String date = req.getParameter("date");
        String countStr = req.getParameter("count");
        String soapUsedStr = req.getParameter("soapUsed");
        String location = req.getParameter("location");
        String durationStr = req.getParameter("duration");
        String remarks = req.getParameter("remarks");

        int count = 0;
        int duration = 0;
        boolean soapUsed = false;

        if (countStr != null) {
            count = Integer.parseInt(countStr);
        }
        if (durationStr != null) {
            duration = Integer.parseInt(durationStr);
        }
        if (soapUsedStr != null && (soapUsedStr.equals("true") || soapUsedStr.equals("on"))) {
            soapUsed = true;
        }

        HandwashDto dto = new HandwashDto(date, count, soapUsed, location, duration, remarks);

        HandwashService service = new HandwashServiceImpl();
        boolean valid = service.save(dto);

        if (valid) {
            System.out.println("Service saved successfully");
            req.setAttribute("success", "Handwash data saved successfully");
        } else {
            System.out.println("Service failed to save");
            req.setAttribute("dto", dto);
            req.setAttribute("failure", "Handwash data not saved");
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("handwash.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running doGet in HandwashServlet...");

        String idStr = req.getParameter("id");

        if (idStr != null && !idStr.trim().isEmpty()) {
            try {
                int id = Integer.parseInt(idStr);
                System.out.println("Searching for ID: " + id);

                HandwashService service = new HandwashServiceImpl();
                Optional<HandwashDto> optional = service.findById(id);

                if (optional.isPresent()) {
                    HandwashDto dto = optional.get();
                    System.out.println("Handwash data found: " + dto);
                    req.setAttribute("handwashDto", dto);
                    req.setAttribute("message", "Record found!");
                } else {
                    System.out.println("No data found for ID: " + id);
                    req.setAttribute("message", "No record found for ID " + id);
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid ID format: " + idStr);
                req.setAttribute("message", "Invalid ID format");
            }
        } else {
            System.out.println("ID parameter is missing");
            req.setAttribute("message", "ID is required");
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("success.jsp");
        dispatcher.forward(req, resp);
    }
}
