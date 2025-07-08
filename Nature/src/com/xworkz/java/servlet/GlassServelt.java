package com.xworkz.java.servlet;
import ServiceImpl.GlassServiceImpl;
import dto.GlassDto;
import service.GlassService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/act")
public class GlassServelt extends HttpServlet {
    public GlassServelt(){
        System.out.println("GlassServelt running in tomcat");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost method in GlassServelt");

        String brand = req.getParameter("brand");
        String capacity = req.getParameter("capacity");
        String material = req.getParameter("material");
        String color = req.getParameter("color");


        GlassDto glassDto = new GlassDto();
        glassDto.setBrand(brand);
        glassDto.setCapacity(capacity);
        glassDto.setMaterial(material);
        glassDto.setColor(color);

        GlassService glassService = new GlassServiceImpl();
        boolean saved = glassService.save(glassDto);

        if (saved) {
            RequestDispatcher dispatcher = req.getRequestDispatcher("GlassSucess.jsp");
            req.setAttribute("message", "Save Success");
            req.setAttribute("glassDto", glassDto);
            dispatcher.forward(req, resp);
        } else {
            RequestDispatcher dispatcher = req.getRequestDispatcher("Glass.jsp");
            req.setAttribute("message", "Saving of Glass Failed");
            dispatcher.forward(req, resp);
        }
    }



}