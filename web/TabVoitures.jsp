<%-- 
    Document   : TabVoitures
    Created on : 30 nov. 2021, 15:09:28
    Author     : Lenovo
--%>

<%@page import="java.util.List"%>
<%@page import="javax.jms.Connection"%>


<%@page import="java.util.ArrayList"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
 <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

        
        
        <link  href="CSS/style2.css"  rel="stylesheet">
        <script src="js/jquery-1.11.1.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </head>
<body>
 
    <div class="wrapper">
    <nav>
      
      <input type="checkbox" id="show-menu">
      <label for="show-menu" class="menu-icon"><i class="fas fa-bars"></i></label>
      <div class="content">
      <div class="logo"><a href="home_admin.jsp">RentelCars</a></div>
        <ul class="links">
          <li><a href="AfficheVoiture">Listes Voitures</a></li>
          <li><a href="#">Réservations</a></li>
          <li><a href="#">Clients</a></li>
          <li><a href="login.jsp">Déconnexion</a></li>
        </ul>
      </div>
      
    </nav>
  </div>
   
       <br/>
       <br/>
       <br/>
       <br/>
       <br/>
      

       
    
<%   if(request.getAttribute("msg")!=null){ %>
        <h2><%=request.getAttribute("msg")%></h2>
        <%}%>
    <div class="container">
        <div class="row">
          
            
            
            
            <div class="col-md-10 col-sm-14 main-content">  
            <div id="page-home">
                      
            <div class="container-fluid">
                <br>
                <h1>LISTES DES VOITURES</h1>
                <div class="container-fluid test "> 
               
                       <div class="row">
                           <div class="col-md-3">
                               <center>  
                            <a href="AjouterVoiture.jsp" class="btn btn-primary   pull-left"><b>+</b> Nouveau Voiture</a>     
                               </center>
                           </div> 
                           <br/> 
                           <br/>
                           
      <div class="col-md-6">
                            
	<div class="row justify-content-center">
                      
                                <form class="form-inline my-2 my-lg-0"   action="rechercheMat.jsp" >
                                <input class="form-control mr-sm-2 " type="text" name="type" placeholder="Search">
                                <button class="btn btn-outline-primary my-2 my-sm-0"  type="submit">Recherche</button>   
                                </form>
                      
                        <!--end of col-->
        </div>
                                   
</div> 
</div>            
 
                         
                  
                     
    <table class="table table-hover">
    <thead>
    
         <tr>
             <th>ID_Voiture</th>
             <th>Marque</th> 
             <th>Carburant</th> 
             <th>Boite Vitesse</th> 
             <th>Max Personnes</th> 
             <th>Prix</th>
             <th>Type</th>
            <th >Image</th>
            <th >Statut</th>
            
        </tr>
    </thead>
            
               
                <% 
                  ArrayList<service.Voiture> lu=(ArrayList<service.Voiture>) request.getAttribute("lu");
                  for(service.Voiture V : lu)
                  {
                      %>
                      <tr>  
                          <td><%=V.getIdVoiture()%></td>
                          <td><%=V.getMarque()%></td>
                          <td><%=V.getCarburant()%></td>
                          <td><%=V.getBoiteVitesse()%></td>
                          <td><%=V.getMaxPersonnes()%></td>
                          <td><%=V.getPrix()%></td>
                          <td><%=V.getType()%></td>
                          <td><img src="<%=V.getImage()%>" width="50" height="50"/></td>
                          <td><%=V.getStatut()%></td>
           
                           <td style="width:30%; "> 
                             
                                     
                                        
                                       <form action="SupprimerVoiture" method="POST">
                                       <input type="hidden" name="idVoiture" value="<%= V.getIdVoiture() %>">
                                        <input class="btn btn-danger btn-xs bttn" type="submit" value="Supprimer">    
                                      </form>
                           </td>
                            <td style="width:30%; "> 
                             
                                       <form action="ModifierVoiture.jsp" >
                                          <input type="hidden" name="idVoiture" value="<%= V.getIdVoiture()%>">
                                        <input class="btn btn-success btn-xs bttn" type="submit" value="Modifier">    
                                      </form>
                           
                          </td>
            </tr>
                               <%
                }
                    %>
    </table>
            
    </div>
</div>
                    
            </div>
        
                
           </div>
     
            </div>
    </div>
        
        
        
        
</body>
</html>

