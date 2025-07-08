package Servlet;

import Dto.StampedeCaseDto;
import Repository.StampedeCaseRepository;
import Repository.StampedeCaserepositoryImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet; // Make sure you use this
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/case") // ✅ This should match the form action
public class StampedeCaseServlet extends HttpServlet {

    private StampedeCaseRepository repository = new StampedeCaserepositoryImpl(); // ✅ added repository

    public StampedeCaseServlet() {
        System.out.println("StampedeCaseServlet running in Tomcat");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost method in StampedeCaseServlet");

        String event = req.getParameter("event");
        int deaths = Integer.parseInt(req.getParameter("deaths")); // ✅ changed to int
        int injuries = Integer.parseInt(req.getParameter("injuries")); // ✅ changed to int
        String location = req.getParameter("location");

        StampedeCaseDto dto = new StampedeCaseDto();
        dto.setEvent(event);
        dto.setDeaths(deaths);   // ✅ passing int
        dto.setInjuries(injuries); // ✅ passing int
        dto.setLocation(location);

        boolean saved = repository.persist(dto);

        if (saved) {
            req.setAttribute("stampedeCaseDto", dto);
            req.getRequestDispatcher("StampedeCaseSuccess.jsp").forward(req, resp);
        } else {
            req.setAttribute("message", "Failed to save case!");
            req.getRequestDispatcher("StampedeCase.jsp").forward(req, resp);
        }
    }
}
