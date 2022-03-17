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
import Models.Voiture;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;
import services.VoitureServer;

/**
 *
 * @author Lenovo
 */
@WebServlet
public class AjouterVoiture extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /*User u=new User();
        ProjetModel PM=new ProjetModel();
        u.setId_user(Integer.parseInt(request.getParameter("id_user")));
        u.setNom(request.getParameter("nom"));
        u.setPrenom(request.getParameter("prenom"));
        u.setCin(request.getParameter("cin"));
        u.setEmail(request.getParameter("email"));
        u.setTel(Integer.parseInt(request.getParameter("tel")));
        u.setPassword(request.getParameter("password"));
        u.setNum_bureau(request.getParameter("num_bureau"));
        u.setGrade(request.getParameter("grade"));
        u.setCadre(request.getParameter("cadre"));
        PM.modifierUser(u);
        request.getRequestDispatcher("/enseignant.jsp").forward(request, response);*/
       
     service.Voiture V = new service.Voiture();
     
       
          //V.setIdVoiture(Integer.parseInt(request.getParameter("idVoiture")));
          V.setMarque(request.getParameter("marque"));
          V.setCarburant(request.getParameter("carburant"));
          V.setBoiteVitesse(request.getParameter("boiteVitesse"));
          V.setMaxPersonnes(Integer.parseInt(request.getParameter("maxPersonnes")));
          V.setPrix(Integer.parseInt(request.getParameter("prix")));
          V.setType(request.getParameter("type"));
          V.setImage(request.getParameter("image"));
          V.setStatut(request.getParameter("statut"));
          
        VoitureServer.ajouterV(V);
     
         request.getRequestDispatcher("/AfficheVoiture").forward(request, response);
          
      
 
    }

}
