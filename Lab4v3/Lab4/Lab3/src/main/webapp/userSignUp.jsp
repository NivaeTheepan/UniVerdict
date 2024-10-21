<%-- 
    Document   : userSignUp
    Created on : Mar 16, 2024, 4:04:29 p.m.
    Author     : nivaetheepan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Sign Up</title>
    </head>
    <body>
        
        <div class="login-hero">
        <h1 class="login-h1">Login Here</h1>
        <% if (request.getAttribute("errorMessage") != null) { %>
        <p style="color: red;"><%= request.getAttribute("errorMessage") %></p>
    <% } %>
         <form action="insertIntoDB" method="POST">
            <p>Username</p>
            <input type="text" name="newUsername" placeholder="Enter Username" size="30">
            <p>Password</p>
            <input type="password" name="newPassword" placeholder="Enter Password" size="30">
            <input type="submit" name="" value="Login"> 
         </form> 
    </div>
         
    </body>
</html>