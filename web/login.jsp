<%-- 
    Document   : login
    Created on : 27 nov. 2021, 01:18:46
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">      
        <title>Login</title>
        <link rel="stylesheet" href="CSS/style.css">
        <link rel="stylesheet" href="CSS/style2.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
    </head>
    <body>
        <div class="wrapper">
    <nav>
      <input type="checkbox" id="show-search">
      <input type="checkbox" id="show-menu">
      <label for="show-menu" class="menu-icon"><i class="fas fa-bars"></i></label>
      <div class="content">
      <div class="logo"><a href="index.jsp">RentelCars</a></div>
        <ul class="links">
         
          <li><a href="#">About</a></li>
          
          <li>
            <a href="#" class="desktop-link">Services</a>
            <input type="checkbox" id="show-services">
            <label for="show-services">Services</label>
            
          </li>
          <li><a href="login.jsp">Connexion</a></li>
        </ul>
      </div>
    </nav>
        </div><br> <br> <br> <br> <br>
               <form  action="LoginServlet" method="Post">
                <div class="form">
                    <center><h2>Connexion</h2></center>
                <input type="email" placeholder="Email" name="email" required>
                <input type="password" placeholder="Password" name="password" required>
                <input class="btnn" type="submit" value="connexion">
                <p class="link"> don't have an account <br>
                    <a href='ajouterClient.jsp'> Sign up </a> here </p>
                <p class="liw">log in with</p>
                <div class="icon">
              <!--      <a href="#"><ion-icon name="logo-facebook"></ion-icon>
                    <a href="#"><ion-icon name="logo-instragram"></ion-icon
                        <a href="#"><ion-icon name="logo-twitter"></ion-icon>
                            <a href="#"><ion-icon name="logo-google"></ion-icon>
                                <a href="#"><ion-icon name="logo-skype"></ion-icon>-->
                </div>
                </div>
                 </form>
       
    </body>
</html>