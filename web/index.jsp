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
        <style>
            .parallax { 



                height: 500px; 

                background-attachment: fixed;
                background-position: center;
                background-repeat: no-repeat;
                background-size: cover;


            }

            @media only screen and (max-device-width: 1024px) {
                .parallax {
                    background-attachment: scroll;
                }
            }
            body, html {
                height: 100%;
            }
        </style>
    </head>
    <body>

        <jsp:include page="nav.jsp"/>
        <jsp:include page="slider.jsp"/>
        <jsp:include page="lowernav.jsp"/>

        <div class="parallax" style="background-image: url('Images/imng_par.jpg')">


        </div>


        <jsp:include page="footer.jsp"/>
        <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script src="Material/js/materialize.js"></script>
        <script src="JS/index_js.js"></script>     

    </body>
</html>
