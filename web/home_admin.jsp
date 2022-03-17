<%-- 
    Document   : home
    Created on : 27 nov. 2021, 02:49:39
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Page</title>
        <link rel="stylesheet" href="CSS/style.css">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
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
          <li><a href="AfficheReservation">Réservations</a></li>
          <li><a href="#">Clients</a></li>
          <li><a href="login.jsp">Déconnexion</a></li>
        </ul>
      </div>
      
    </nav>
  </div>
  
    </body>
</html>
