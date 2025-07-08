package com.xworkz.java;

import dto.FeedbackDto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/feedbackAction")
public class FeedbackServlet extends HttpServlet {
    public FeedbackServlet() {
        System.out.println("FeedbackServlet running in tomcat");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String rating = req.getParameter("rating");
        String comments = req.getParameter("comments");

        FeedbackDto feedback = new FeedbackDto();
        feedback.setName(name);
        feedback.setEmail(email);
        feedback.setRating(rating);
        feedback.setComments(comments);

        System.out.println("Received feedback: " + feedback);

        // You can forward to a JSP or send a response here
        resp.getWriter().write("Thank you for your feedback, " + name + "!");


    }
}
