package com.xworkz.java;

import dto.LicenseDto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/act")
public class LicenseServlet extends HttpServlet {
    public LicenseServlet() {
        System.out.println("LicenseServlet running in tomcat");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String type = req.getParameter("type");
        String holderName = req.getParameter("holderName");
        String issueDate = req.getParameter("issueDate");
        String expiryDate = req.getParameter("expiryDate");

        LicenseDto license = new LicenseDto();
        license.setType(type);
        license.setHolderName(holderName);
        license.setIssueDate(issueDate);
        license.setExpiryDate(expiryDate);

        System.out.println("License details received: " + license);

        resp.getWriter().write("License info submitted successfully for " + holderName);

    }
}
