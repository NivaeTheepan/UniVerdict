<%-- 
    Document   : userWelcome
    Created on : Feb 4, 2024, 5:09:18 PM
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        
        <style>
            body 
            {
                background-color: #e3f2fd;
            }
        </style>
        
        <!-- Import CSS -->
      <link rel="stylesheet" href="css/style.css" />
      <link rel="icon" href="img/univerdict-favicon-white.png" type="image/x-icon"> <!-- To see favicon, load this file only -->
      <title>User Portal</title>
      
    </head>

    <body>
        <header class="header">
      <a href="userWelcome.jsp">
        <img class="logo" src="img/logo-univerdict-transparent.png" />
      </a>
    </header>
        <section class="container">
        <div class="user-hero">
            <h1 class="user-h1">Welcome to the User homepage</h1>
            <p class="user-p1">
                Here you will find all features accessible to a Registered User. As user with login
                credentials, you have the ability to react (like/dislike) resources that are present
                on UniVerdict's Resources page. This allows students to see which resources helped other
                students when learning a new topic. On top of reacting to resources, to add more help for
                future students, users also have the ability to leave a comment on a resource. This allows
                future students to get an idea as to how the resource helped/didn't help a particular user.
            </p>
            
            <!-- comment 
            <ul class="bullet-point">
                <li>To access the Homepage of UniVerdict - <a class="btn btn-with-bg" href="index.html">Homepage</a> </li>
                <li>To access the Resources page of UniVerdict - <a class="btn btn-with-bg" href="resources.jsp">Resources</a> </li>
                <li>To access the Login page of UniVerdict - <a class="btn btn-with-bg" href="Login.jsp">Login</a> </li>
                <li>To access the About Us page of UniVerdict - <a class="btn btn-with-bg" href="about.html">About Us</a> </li>
            </ul> -->
            
            <p class="user-p2">To access the Homepage of UniVerdict -  <a class="btn btn-with-bg" href="index.html">Homepage</a> </p>
            <p class="user-p2">To access the Resources page of UniVerdict - <a class="btn btn-with-bg" href="resources.jsp">Resources</a> </p>
            <p class="user-p2">To access the Course page of UniVerdict - <a class="btn btn-with-bg" href="courses.jsp">Courses</a> </p>
            <p class="user-p2">To Logout of UniVerdict <a class="btn btn-with-bg" href="Login.jsp">Logout</a> </p>
            <p class="user-p2">To access the About Us page of UniVerdict - <a class="btn btn-with-bg" href="about.html">About Us</a> </p>
        </div>
      </section>
    </body>
</html>
