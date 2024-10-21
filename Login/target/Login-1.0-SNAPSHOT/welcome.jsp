<%-- 
    Document   : welcome
    Created on : Feb 4, 2024, 4:34:04 PM
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
      <title>Admin Portal</title>
      
    </head>

    <body>
        <header class="header">
      <a href="welcome.jsp">
        <img class="logo" src="img/logo-univerdict-transparent.png" />
      </a>
    </header>
        
        <section class="container">
        <div class="user-hero">
            <h1 class="user-h1">Welcome to the Admin homepage</h1>
            <p class="user-p1">
                Here you will find all the features accessible to Admins of UniVerdict. As a user with
                admin credentials, you have several key abilities that a regular user does not have such as:
                
                <ul class="bullet-point">
                    <li>Modify aspects of the "About Us" page like:</li>
                        <ul class="sub-bullet-point">
                            <li>Founder's headshots</li>
                            <li>Description of each founder</li>
                            <li>Admin List</li>
                            <li>Founder's & Admin's email addresses/phone #</li>
                        </ul>
                    <li>Modify aspects of the "Courses" page like:</li>
                        <ul class="sub-bullet-point">
                           <li>Add Courses</li>
                           <li>Modify Course Description</li>
                           <li>Calculate New Course Rating Average from user rating data</li>
                           <li>Remove user comments</li>
                        </ul>
                </ul>
            </p>
            
            <p class="user-p2">To access the Homepage of UniVerdict -  <a class="btn btn-with-bg" href="index.html">Homepage</a> </p>
            <p class="user-p2">To access the Resources page of UniVerdict - <a class="btn btn-with-bg" href="/AddResource/addResources.html">Resources</a> </p>
<!--            <p class="user-p2">To access the Courses page of UniVerdict - <a class="btn btn-with-bg" href="/AddCourse/addCourses.html">Courses</a> </p>-->
            <p class="user-p2">To access the Logout of UniVerdict - <a class="btn btn-with-bg" href="Login.jsp">Logout</a> </p>
            <p class="user-p2">To access the About Us page of UniVerdict - <a class="btn btn-with-bg" href="about.html">About Us</a> </p>
        </div>
      </section>
    </body>
</html>


