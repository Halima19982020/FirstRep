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
         
       <div class="container">
        <div class="row">
            <div class="col-xs-offset-1 col-sm-8 col-md-6 well well-lg">
                <br><br>
            <legend><a href=""><i class="glyphicon glyphicon-globe"></i></a> NOUVEAU Voiture</legend>
            
            <form  action="AjouterVoiture" method="POST" class="form" role="form" >
                
            
               
                <select class="form-control" name="marque" required>
                        <option value="" selected disabled hidden>Select marque</option>
                        <option value="Dacia">Dacia</option>
                        <option value="BMW">BMW</option>
                        <option value="Porsche Panamera">Porch Panamera</option>
                        <option value="CC">CC</option>
                    </select>
                <select class="form-control" name="carburant" required>
                        <option value="" selected disabled hidden>Select</option>
                        <option value="Gazole">Gazole</option>
                        <option value="Essence">Essence</option>
                    </select>
                <select class="form-control" name="boiteVitesse" required>
                        <option value="" selected disabled hidden>Select</option>
                        <option value="Manuelle">Manuelle</option>
                        <option value="Automatique">Automatique</option>
                    </select>
                <input class="form-control" name="maxPersonnes" placeholder="maxPersonnes" type="text"/>
                <input class="form-control" name="prix" placeholder="prix" type="text"/>
                <select class="form-control" name="type" required>
                        <option value="" selected disabled hidden>Select</option>
                        <option value="Economique">Economique</option>
                        <option value="Delux">Delux</option>
                    </select>
                
                <input class="form-control" name="image" placeholder="image" type="file" accept="CSS/*">
               
                <select class="form-control" name="statut" required>
                        <option value="" selected disabled hidden>Select</option>
                        <option value="Disponible">Disponible</option>
                        <option value="reserver">reserver</option>
                    </select>
                <!--<input name="Dacia" type="image" src="dacia.jpg" height="100" width="150">-->
                
                 
                 
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
