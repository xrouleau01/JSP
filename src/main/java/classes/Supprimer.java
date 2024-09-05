package classes;

import classes.ProduitService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "supprimer", value = "/supprimer")
public class Supprimer extends HttpServlet {

    ProduitService service;

    public void init() {
        ServletContext servletContext = getServletContext();
        this.service = (ProduitService) servletContext.getAttribute("service");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String id = request.getParameter("NoProduit");
        int intID = Integer.parseInt(id);
        request.setAttribute("produit", service.getProduit(intID));
        RequestDispatcher dispatcher = request.getRequestDispatcher("supprimer.jsp");
        dispatcher.forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    }

    public void destroy() {
    }
}