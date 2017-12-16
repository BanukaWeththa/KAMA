<%-- 
    Document   : home
    Created on : Nov 18, 2017, 1:46:51 AM
    Author     : taKUna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <link type="text/css" rel="stylesheet" href="CSS/home.css">
        <link type="text/css" rel="stylesheet" href="CSS/index_css.css">
        <link type="text/css" rel="stylesheet" href="Material/css/materialize.min.css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>

        <nav class="navbar navbar-default navbar-doublerow navbar-trans navbar-fixed-top">

            <nav class="navbar navbar-top hidden-xs">
                <div class="container">

                    <ul class="nav navbar-nav pull-left tb1">
                        <li><a href="#"><i class="fa fa-facebook-official fa-2x"></i></a></li>
                        <li><a href="#"><i class="fa fa-instagram fa-2x"></i></a></li>
                        <li><a href="#"><i class="fa fa fa-twitter fa-2x"></i></a></li>
                        <li><a href="#"><span class="text-white" style="font-size: 16px;font-family: monospace;">CALL: <b>+94 112 561 489</b> </span></a></li>
                    </ul>

                    <ul class="nav navbar-nav pull-right tb2">
                        <li><a href="#" class="text-white" style="font-size: 16px;font-family: monospace;">Login</a></li>
                        <li><a href="#" class="text-white cartI" style="font-size: 16px;font-family: monospace;"><i class="material-icons">shopping_cart</i> </a></li> 
                    </ul>
                </div>
            </nav>


            <nav class="navbar navbar-down">
                <div class="container">
                    <div class="flex-container">  
                        <ul class="nav navbar-nav flex-item hidden-xs">
                            <li><a href="#">Home</a></li>
                            <li><a href="#">About Us</a></li>
                            <li><a href="#">Products</a></li>
                            <li><a href="#">Contact Us</a></li>

                        </ul>

                        <ul id="nav-mobile" class="side-nav">
                            <li><a data-activates="nav-mobile" class="button-collapse" id="p" href="#"><i class="material-icons">close</i></a></li>
                            <li><a id="p" href="#">Home</a></li>
                            <li><a id="p" href="#">About Us</a></li>
                            <li><a id="p" href="#">Products</a></li>
                            <li><a id="p" href="#">Contact Us</a></li>
                        </ul>
                        <a style="margin-left: -4%;" href="#" data-activates="nav-mobile" class="button-collapse"><i class="material-icons">menu</i></a>

                    </div>  
                </div>
            </nav>
        </nav> 

        <header>
            <img src="https://images.unsplash.com/photo-1467709757686-06cbdd818d90?auto=format&fit=crop&w=666&q=60&ixid=dW5zcGxhc2guY29tOzs7Ozs%3D" style="width:100%">
        </header>    
        <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script src="Material/js/materialize.js"></script>
        <script src="JS/index_js.js"></script>     

    </body>
</html>
