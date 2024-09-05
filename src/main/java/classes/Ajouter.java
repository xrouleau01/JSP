package classes;

import classes.ProduitService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ajouter", value = "/ajouter")
public class Ajouter extends HttpServlet {

    ProduitService service;

    public void init() {
        ServletContext servletContext = getServletContext();
        this.service = (ProduitService) servletContext.getAttribute("service");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("ajouter.jsp");
        dispatcher.forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Produit p = new Produit( Integer.parseInt(request.getParameter("no")) , request.getParameter("nom"), Double.parseDouble(request.getParameter("prix")), Boolean.parseBoolean(request.getParameter("tax")));
        service.addProduit(p);
        response.sendRedirect("hello-servlet");
    }

    public void destroy() {
    }
}