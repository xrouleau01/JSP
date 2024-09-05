package classes;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    ProduitService service = new ProduitService();

    public void init() {
        this.service = new ProduitService();
        ServletContext servletContext = getServletContext();
        servletContext.setAttribute("service", service);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("lsProduits", service.getProduits());
        RequestDispatcher dispatcher = request.getRequestDispatcher("affichage.jsp");
        dispatcher.forward(request, response);
    }

    public void destroy() {
    }
}