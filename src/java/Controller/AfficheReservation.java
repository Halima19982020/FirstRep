/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.ReservationServer;
import services.VoitureServer;

/**
 *
 * @author Lenovo
 */
public class AfficheReservation extends HttpServlet {
protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AfficheVoiture</title>");            
            out.println("</head>");
            out.println("<body>");
           
                List<service.Reservation>  lu=new ArrayList<>();
             
                lu=ReservationServer.afficher();
                request.setAttribute("lu", lu);
               request.getRequestDispatcher("/TabReservation.jsp").forward(request, response);
            
           
            out.println("</body>");
            out.println("</html>");
        }
    }

        
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
       processRequest(request, response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
                   

        List<service.Reservation>  lu=new ArrayList<>();
             
                lu=ReservationServer.afficher();
                request.setAttribute("lu", lu);
               request.getRequestDispatcher("/TabReservation.jsp").forward(request, response);
    }
}
