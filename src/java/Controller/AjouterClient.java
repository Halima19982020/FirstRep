/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Models.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.ClientErrorException;
import services.JerseyClient;
import services.VisualServer;
import services.VoitureServer;

/**
 *
 * @author Lenovo
 */
@WebServlet
public class AjouterClient extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
     JerseyClient user = new JerseyClient();
     /*
      PrintWriter out = response.getWriter();
       
     int id=Integer.parseInt(request.getParameter("id"));
     String nom=request.getParameter("nom");
     String prenom=request.getParameter("prenom");
     //String cin=request.getParameter("cin");
     String email=request.getParameter("email");
     String password=request.getParameter("password");
     int telephone=Integer.parseInt(request.getParameter("telephone"));
     String role=request.getParameter("role");
     String adresse=request.getParameter("adresse");
     //String cadre=request.getParameter("cadre");
     
     
     User u=new User(id_user,nom,prenom,cin,email,tel,password,num_bureau,grade,cadre);
     try{
      ProjetModel PM=new ProjetModel ();
      if(PM.AjouterUSER(u)){
      this.getServletContext().getRequestDispatcher("/AffichUser").forward(request, response);
      
      }else{
      out.print("ERROR");
      }}
      catch(Exception e){
              e.printStackTrace();
              }*/
    // V.setIdVoiture(Integer.parseInt(request.getParameter("idVoiture")));
          
      int id=Integer.parseInt(request.getParameter("id"));
     String nom=request.getParameter("nom");
     String prenom=request.getParameter("prenom");
     //String cin=request.getParameter("cin");
     String email=request.getParameter("email");
     String password=request.getParameter("password");
     int telephone=Integer.parseInt(request.getParameter("telephone"));
     String role=request.getParameter("role");
     String adresse=request.getParameter("adresse");
     //String cadre=request.getParameter("cadre");
     User u=new User(id,nom,prenom,email,password,telephone,role,adresse);
     try{
     
      if(user.ajouter(u)){
      this.getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
      
      }
      else{
      out.print("ERROR");
      }
     }
      catch(IOException | ServletException | ClientErrorException e){
              e.printStackTrace();
              }
         
     
    }
}
