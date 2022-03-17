<%-- 
    Document   : ModifierVoiture
    Created on : 2 déc. 2021, 12:58:09
    Author     : Lenovo
--%>


<%@page import="service.Voiture"%>
<%@page import="services.VoitureServer"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!-- int idVoiture = Integer.parseInt(request.getParameter("idVoiture"));
    VoitureServer bkd = new VoitureServer();
    service.Voiture bk = new service.Voiture();
    bkd.modifier(bk);
    request.setAttribute("lm", bk); -->
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

        
        
        <link rel="stylesheet" href="CSS/style.css">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
        <script src="js/jquery-1.11.1.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <title>JSP Page</title>
        
    </head>
    <body>
       <%
           
           VoitureServer voiture = new VoitureServer();
    int idVoiture = Integer.parseInt(request.getParameter("idVoiture"));
     service.Voiture  bk= new  service.Voiture();
     bk = voiture.getSingledem(idVoiture);
%>
        <div class="wrapper">
    <nav>
      
      <input type="checkbox" id="show-menu">
      <label for="show-menu" class="menu-icon"><i class="fas fa-bars"></i></label>
      <div class="content">
      <div class="logo"><a href="home_admin.jsp">RentelCars</a></div>
        <ul class="links">
          <li><a href="AfficheVoiture">Listes Voitures</a></li>
          <li><a href="AfficheReservation">Réservations</a></li>
          <li><a href="#">Clients</a></li>
          <li><a href="login.jsp">Déconnexion</a></li>
        </ul>
      </div>
      
    </nav>
  </div>
       <br/>
       <br/>
       <br/>
    <center>
       <div class="col-md-10 col-sm-14 main-content">

      
                    <div id="page-home">
                      
            <div class="container-fluid">
                <br>
                <h1><b>Voiture</b> </h1>
                <div class="container-fluid test  "> 
        <form action="ModifierVoiture" method="post" class="form" role="form">
        
        <div class="row">
     
     <div class="col-md-4">

            <div class="form-group">
               
                <label>ID Voiture</label>
                <input class="form-control" value="<%= bk.getIdVoiture()%>" type="text"  />
                <input type="hidden" name="idVoiture"   value="<%= bk.getIdVoiture()%>" />
             </div>
           
    
            <div class="form-group">
                <label>Marque</label>
                 <input class="form-control" name="marque" value="<%= bk.getMarque() %>" type="text" />
             </div>

            <div class="form-group">
         	<label>Carburant</label>
                 <input class="form-control" name="carburant" value="<%= bk.getCarburant() %>" type="text" />
             </div>
          <div class="form-group">
         	<label>Boite Vitesse</label>
                 <input class="form-control" name="boiteVitesse" value="<%= bk.getBoiteVitesse()%>" type="text" />
             </div>
            <div class="form-group">
         	<label>Max Personnes</label>
                 <input class="form-control" name="maxPersonnes" value="<%= bk.getMaxPersonnes()%>" type="text" />
             </div>
          </div>
              <div class="col-md-4">
         
            
         
            
      
              <div class="form-group">
         	<label>Prix</label>
                 <input class="form-control" name="prix" value="<%= bk.getPrix() %>" type="text"  />
              </div>
              
                <div class="form-group">
         	<label>Type</label>
                 <input class="form-control" name="type" value="<%= bk.getType() %>" type="text" />
             </div>
             <div class="form-group">
         	<label>Image</label>
                
                 <input class="form-control" name="image" value="<%= bk.getImage() %>" type="file" />
                 
             </div>
             <div class="form-group">
         	<label>Statut</label>
                 <input class="form-control" name="statut" value="<%= bk.getStatut() %>" type="text" />
             </div>
             
      
             
            
    <center> <button class="btn btn-lg btn-info " type="submit">
            MODIFIER
            </button> </center>
           
     
                </div>
             </div> 
        </form>
      </div>   
    </div>
        </div>
             </div>
             </center>
    </body>
</html>
