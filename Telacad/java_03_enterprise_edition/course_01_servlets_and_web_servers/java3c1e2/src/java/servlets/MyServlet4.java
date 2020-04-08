/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author robert
 */
@WebServlet(name = "MyServlet4", urlPatterns = {"/MyServlet4"})
public class MyServlet4 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try (PrintWriter out = resp.getWriter()) {
            out.println("<html>");
            
            out.println("<head>");
            out.println("</head>");
            
            
            out.println("<body>");
            out.println("<form method=post>");
            out.println("Nume: <input type = text name = nume />");
            out.println("<input type = submit value = Salut />");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nume = request.getParameter("nume");
        try (PrintWriter out = response.getWriter()) {
            out.println("Hello, " + nume);
        }
    }

}
