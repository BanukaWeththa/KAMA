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
        <link type="text/css" rel="stylesheet" href="CSS/index_css.css">
        <link type="text/css" rel="stylesheet" href="Material/css/materialize.min.css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Merriweather+Sans" rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
            <jsp:include page="CSS/index_css.css"/>
            <jsp:include page="CSS/footer.css"/>
        </style>
    </head>
    <body>

        <jsp:include page="nav.jsp"/>


        <div class="carousel carousel-slider center" data-indicators="true">
            <div class="carousel-fixed-item center">
                <a class="btn waves-effect white grey-text darken-text-2">button</a>
            </div>
            <div class="carousel-item red white-text" href="#one!">

            </div>
            <div class="carousel-item amber white-text" href="#two!">

            </div>
            <div class="carousel-item green white-text" href="#three!">

            </div>
            <div class="carousel-item blue white-text" href="#four!">

            </div>
        </div>

        <jsp:include page="footer.jsp"/>
        <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script src="Material/js/materialize.js"></script>
        <script src="JS/index_js.js"></script>     

    </body>
</html>
