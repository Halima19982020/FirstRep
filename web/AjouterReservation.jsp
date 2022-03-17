<%-- 
    Document   : AjouterVoiture
    Created on : 1 déc. 2021, 11:52:15
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
        <br/>
       <div class="container">
        <div class="row">
            <div class="col-xs-offset-1 col-sm-8 col-md-6 well well-lg">
                <br><br>
            <legend><a href=""><i class="glyphicon glyphicon-globe"></i></a> NOUVelle Reservation</legend>
            
            <form  action="AjouterReservation" method="POST" class="form" role="form" >
                
            
                
                <input class="form-control" name="date_debut" placeholder="Date Début" type="date" />
                <input class="form-control" name="date_fin" placeholder="Date Fin" type="date"/>
                <!-- <input class="form-control" name="id" placeholder="Id Client" type="text"/>-->
                <input class="form-control" name="idVoiture" placeholder="Id Voiture" type="text"/>
               
              
                
                 
                 
                 <span class="bg-danger" id="MessageP"></span>
            <br />
          
            <button class="btn btn-lg btn-info " type="submit">
                Enregistrer</button>
              
            </form>
        </div>
    </div>
</div>
    </body>
</html>
