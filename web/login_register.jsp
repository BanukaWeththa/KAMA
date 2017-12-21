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
        
        <title>JSP Page</title>
    </head>
    <body>
        <div class="space-medium">
            <div class="container">
                <div class="row">
                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                        <div class="account-holder">
                            <!--login-form-->
                            <h3>Login to Today’s Fashion</h3>
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
                                            <label class="control-label required" for="email">Email<sup style="color:red">*</sup></label>
                                            <input id="email" name="email" type="text" class="form-control" placeholder="Enter Email Address">
                                        </div>
                                    </div>
                                    <div class="col-lg-12 col-md-12 col-sm-6 col-xs-12">
                                        <div class="form-group">
                                            <label class="control-label required" for="email">Password<sup style="color:red">*</sup></label>
                                            <input id="password" name="password" type="password" class="form-control" placeholder="password">
                                        </div>
                                        <a href="#" class="forgot-password">Forgot Password?</a>
                                    </div>
                                    <div class="col-lg-12 col-md-12 col-sm-6 col-xs-12">
                                        <button class="btn btn-primary btn-block">Login</button>
                                        <div class="checkbox">
                                            <label>
                                                <input type="checkbox" value="">

                                                <p>Remember Me?</p>
                                            </label>

                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                    <!--/.login-form-->
                    <!--sing-up-form-->
                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                        <div class="account-holder">
                            <h3>Signup With Today’s Fashion</h3>
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
                                <form>
                                    <div class="col-lg-12 col-md-12 col-sm-6 col-xs-12">
                                        <div class="form-group">
                                            <label class="control-label required" for="name"> Name<sup style="color:red">*</sup></label>
                                            <input id="name" name="name" type="text" class="form-control" placeholder="Enter Your NAme">
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
                                            <input id="password" name="password" type="password" class="form-control" placeholder="password">
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
                    <!--/.sing-up-form-->
                    Created by <a href="https://goo.gl/aiZCwf" target="_blank">easetemplate</a>
                </div>

            </div>
        </div>
    </div>
    <!--/.forms-->
</body>
</html>
