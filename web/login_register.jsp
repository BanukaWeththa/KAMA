<%-- 
   Document   : newjsp
   Created on : Dec 16, 2017, 7:01:14 PM
   Author     : taKUna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <link href="CSS/login_register.css" type="text/css" rel="stylesheet">
        <link type="text/css" rel="stylesheet" href="Material/css/materialize.css">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.css" rel="stylesheet" id="bootstrap-css">

        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

        <title>JSP Page</title>
        <style>
            <jsp:include page="CSS/index_css.css"/>
            <jsp:include page="CSS/footer.css"/>
        </style>
      
    </head>
    <body>
        <jsp:include page="nav.jsp"/>

        <div class="space-medium">
            <div class="container">
                <div class="row">
                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                        <div class="account-holder">

                            <h3>Login to PicPick</h3>
                            <br>
                            <div class="social-btn">
                                <h6>Sign in With</h6>
                                <div class="fb-btn">
                                    <i class="fa fa-facebook-official"></i><a href="#" class="fb-btn-text">facebook</a>
                                </div>
                                <div class="google-btn">
                                    <i class="fa fa-google"></i><a href="#" class="google-btn-text">Google</a>
                                </div>
                            </div>
                            <div class="row">
                                <form>
                                    <div class="col-lg-12 col-md-12 col-sm-6 col-xs-12">
                                        <div class="form-group">
                                            <label class="control-label required" for="logemail">Email<sup style="color:red">*</sup></label>
                                            <input id="logemail" name="logemail" type="text" class="form-control" placeholder="Enter Email Address">
                                        </div>
                                    </div>
                                    <div class="col-lg-12 col-md-12 col-sm-6 col-xs-12">
                                        <div class="form-group">
                                            <label class="control-label required" for="email">Password<sup style="color:red">*</sup></label>
                                            <input id="logpassword" name="logpassword" type="password" class="form-control" placeholder="password">
                                        </div>
                                        <a href="#" class="forgot-password">Forgot Password?</a>
                                    </div>
                                    <div class="col-lg-12 col-md-12 col-sm-6 col-xs-12">
                                        <button class="btn btn-primary btn-block">Login</button>
                                        <div class="checkbox">
                                            <label>
                                                <input type="checkbox" value="" style="opacity: 100;">

                                                <p>Remember Me?</p>
                                            </label>

                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>

                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                        <div class="account-holder">
                            <h3>Signup With PicPick</h3>
                            <br>
                            <div class="social-btn">
                                <h6>Sign up With</h6>
                                <div class="fb-btn">
                                    <i class="fa fa-facebook-official"></i><a href="#" class="fb-btn-text">facebook</a>
                                </div>
                                <div class="google-btn">
                                    <i class="fa fa-google"></i><a href="#" class="google-btn-text">Google</a>
                                </div>
                            </div>
                            <div class="row">
                                <form id="registerform" method="POST" action="login_register">
                                    <div class="col-lg-12 col-md-12 col-sm-6 col-xs-12">
                                        <div class="form-group">
                                            <label class="control-label required" for="firstname">First Name<sup style="color:red">*</sup></label>
                                            <input id="firstName" name="firstName" type="text" class="form-control" placeholder="Enter First Your Name">
                                        </div>
                                    </div>
                                    <div class="col-lg-12 col-md-12 col-sm-6 col-xs-12">
                                        <div class="form-group">
                                            <label class="control-label required" for="lastname">Last Name<sup style="color:red">*</sup></label>
                                            <input id="lastName" name="lastName" type="text" class="form-control" placeholder="Enter Your Last Name">
                                        </div>
                                    </div>
                                    <div class="col-lg-12 col-md-12 col-sm-6 col-xs-12">
                                        <div class="form-group">
                                            <label class="control-label required" for="phone">Phone<sup style="color:red">*</sup></label>
                                            <input id="phone" name="phone" type="text" class="form-control" placeholder="Enter Mobile Number">
                                        </div>
                                    </div>
                                    <div class="col-lg-12 col-md-12 col-sm-6 col-xs-12">
                                        <div class="form-group">
                                            <label class="control-label required" for="email">Email<sup style="color:red">*</sup></label>
                                            <input id="email" name="email" type="text" class="form-control" placeholder="Enter Email Address">

                                    </div>
                                    </div>
                                    <div class="col-lg-12 col-md-12 col-sm-6 col-xs-12">
                                        <div class="form-group">
                                            <label class="control-label required" for="password">Password<sup style="color:red">*</sup></label>
                                            <input id="password" name="password" type="password" class="form-control" placeholder="Password">
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label required" for="repassword">Re-enter Password<sup style="color:red">*</sup></label>
                                            <input id="repassword" name="repassword" type="password" class="form-control" placeholder="Re-enter password">
                                        </div>
                                        <div class="mb30">
                                            <p>Already have an account?   <a href="#">Login</a></p>
                                        </div>
                                    </div>
                                    <div class="col-lg-12 col-md-12 col-sm-6 col-xs-12">
                                        <button class="btn btn-primary btn-block">Register</button>
                                    </div>
                                </form>
                            </div>
                        </div>

                    </div>

                </div>

            </div>
        </div>

        <jsp:include page="footer.jsp"/>
        <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.0/jquery.validate.js"></script>
        <script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.0/additional-methods.min.js"></script>
        <script src="JS/Validation/validation.js"></script>
    </body>
</html>
