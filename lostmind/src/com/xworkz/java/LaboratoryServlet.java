package com.xworkz.java;

import dto.LaboratoryDto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/lab-act")
public class LaboratoryServlet extends HttpServlet {
    public LaboratoryServlet() {
        System.out.println("LaboratoryServlet running in tomcat");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String location = req.getParameter("location");
        String technician = req.getParameter("technician");
        String type = req.getParameter("type");

        LaboratoryDto lab = new LaboratoryDto();
        lab.setName(name);
        lab.setLocation(location);
        lab.setTechnician(technician);
        lab.setType(type);

        System.out.println("Laboratory details received: " + lab);

        resp.getWriter().write("Laboratory details submitted successfully for " + name);

    }
}