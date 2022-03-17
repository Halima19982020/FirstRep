/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
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
public class ModifierVoiture extends HttpServlet {

  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {}
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       service.Voiture V = new service.Voiture();
     
          
          V.setMarque(request.getParameter("marque"));
          V.setCarburant(request.getParameter("carburant"));
          V.setBoiteVitesse(request.getParameter("boiteVitesse"));
          V.setMaxPersonnes(Integer.parseInt(request.getParameter("maxPersonnes")));
          V.setPrix(Integer.parseInt(request.getParameter("prix")));
          V.setType(request.getParameter("type"));
          V.setImage(request.getParameter("image"));
          V.setStatut(request.getParameter("statut"));
          V.setIdVoiture(Integer.parseInt(request.getParameter("idVoiture")));
        VoitureServer.modifier(V);
      
         request.getRequestDispatcher("/AfficheVoiture").forward(request, response); 
    
    }
}
