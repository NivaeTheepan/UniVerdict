<%-- 
    Document   : login
    Created on : Feb 4, 2024, 3:59:07 PM
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />

        <style>
            body {
                margin: 0;
                padding: 0;
                background-image: url("img/login-background.jpg"); 
                background-attachment: fixed;
                background-size: cover;
                background-position: center;
            }
        </style>

        <!-- Import CSS -->
        <link rel="stylesheet" href="css/style.css" />
        <link rel="icon" href="img/univerdict-favicon-white.png" type="image/x-icon"> <!-- To see favicon, load this file only -->
        <title>UniVerdict</title>
    </head>

    <body>
        <header class="header">
            <a href="index.html">
                <img class="logo" src="img/logo-univerdict-transparent.png" />
            </a>
            <nav class="navbar">
                <ul class="navbar-list">
                    <li><a class="navbar-link" href="about.html">About Us</a></li>
                    <li><a class="navbar-link" href="resources.jsp">Resources</a></li>
                    <li><a class="navbar-link" href="courses.jsp">Courses</a></li>
                    <li><a class="navbar-link nav-login" href="Login.jsp">Login</a></li>
                </ul>
            </nav>
        </header>

        <div class="login-hero">
            <h1 class="login-h1">Login Here</h1>
            <% if (request.getAttribute("errorMessage") != null) {%>
            <p style="color: red;"><%= request.getAttribute("errorMessage")%></p>
            <% }%>
            <form action="Login" method="POST"> 
                <p>Username</p>
                <input type="text" name="username" placeholder="Enter Username" size="30">
                <p>Password</p>
                <input type="password" name="password" placeholder="Enter Password" size="30">
                <input type="submit" name="" value="Login">
            </form> 
        </div>

        <div class="user-sign-up">
            <a href="userSignUp.jsp"> <button> <h3> User Sign Up </h3> </button> </a>
        </div>

    </body>
</html> 

