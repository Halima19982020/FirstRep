/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.ReservationServer;


/**
 *
 * @author Lenovo
 */
public class SupprimerReservation extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int idreservation=Integer.parseInt(request.getParameter("idreservation"));
          
           ReservationServer.delete(idreservation);
       
         
     request.getRequestDispatcher("/AfficheReservation").forward(request, response);
    }
}
