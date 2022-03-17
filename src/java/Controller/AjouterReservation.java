/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.annotation.WebServlet;
import services.ReservationServer;


/**
 *
 * @author Lenovo
 */
@WebServlet
public class AjouterReservation extends HttpServlet {

    
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
      
     service.Reservation R=new service.Reservation();
     R.setIdreservation(Integer.parseInt(request.getParameter("idreservation")));
     R.setDateDebut(request.getParameter("date_debut"));
     R.setDateFin(request.getParameter("date_fin"));
     R.setId(Integer.parseInt(request.getParameter("id")));
     R.setIdVoiture(Integer.parseInt(request.getParameter("idVoiture")));
     
     
         
      ReservationServer.ajouter(R);
     request.getRequestDispatcher("/AfficheReservation").forward(request, response);
      
      
    }

}
