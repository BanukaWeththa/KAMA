<%-- 
    Document   : nav
    Created on : Dec 23, 2017, 12:49:57 AM
    Author     : taKUna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <link type="text/css" rel="stylesheet" href="CSS/index_css.css">
        <link type="text/css" rel="stylesheet" href="Material/css/materialize.min.css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Merriweather+Sans" rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
   
        <title>JSP Page</title>
    </head>
    <body>
        <nav class="navbar navbar-default" style="background-color:rgba(255, 255, 255,0.5);margin-bottom: 0px;">
            <div class="nav-wrapper container navbar-fixed" style="width: 100%;">

                <ul class="right hide-on-med-and-down navbar-right">
                    <li><a style="text-decoration: none;" href="index.jsp"><i class="material-icons right" >home</i>Home</a></li>
                    <li><a style="text-decoration: none;" href="#"><i class="material-icons right" >settings</i>About Us</a></li>
                    <li><a style="text-decoration: none;" href="#"><i class="material-icons right" >redeem</i>Products</a></li>
                    <li><a style="text-decoration: none;" href="#"><i class="material-icons right" >call</i>Contact Us</a></li>
                    <li style=""><a href="login_register.jsp" class="text-white cartI" style="margin-top: 0px;text-decoration: none;"><i class="material-icons right" >person</i>Login/Register</a></li> 
                    <li><a href="#" class="text-white cartI" style="margin-top: 0px;text-decoration: none;"><i class="material-icons right" >shopping_cart</i>Cart</a></li> 



                </ul>


                <ul id="nav-mobile" class="side-nav">
                    <li><a id="p" href="#"><i class="material-icons right" style="line-height: 50px;">person</i>Login/Register</a></li>
                    <li><a id="p" href="#"><i class="material-icons right" style="line-height: 50px;">home</i>Home</a></li>
                    <li><a id="p" href="#"><i class="material-icons right" style="line-height: 50px;">settings</i>About Us</a></li>
                    <li><a id="p" href="#"><i class="material-icons right" style="line-height: 50px;">redeem</i>Products</a></li>
                    <li><a id="p" href="#"><i class="material-icons right" style="line-height: 50px;">call</i>Contact Us</a></li>

                </ul>
                <a href="#" data-activates="nav-mobile" class="button-collapse"><i class="material-icons">menu</i></a>
            </div>
        </nav>
    </body>
</html>
