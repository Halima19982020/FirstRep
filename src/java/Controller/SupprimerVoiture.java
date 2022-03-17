    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.VoitureServer;

/**
 *
 * @author Lenovo
 */
@WebServlet
public class SupprimerVoiture extends HttpServlet {
 protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
     
        
             int idVoiture=Integer.parseInt(request.getParameter("idVoiture"));
          
            VoitureServer.delete(idVoiture);
       
         
     request.getRequestDispatcher("/AfficheVoiture").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int idVoiture=Integer.parseInt(request.getParameter("idVoiture"));
          
            VoitureServer.delete(idVoiture);
       
         
     request.getRequestDispatcher("/AfficheVoiture").forward(request, response);
    }

    
    
}
