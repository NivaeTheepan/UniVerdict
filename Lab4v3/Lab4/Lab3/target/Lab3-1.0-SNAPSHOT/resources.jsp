<%-- 
    Document   : resources
    Created on : Feb 4, 2024, 4:57:46 PM
    Author     : student
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <!-- Import CSS -->
        <link rel="stylesheet" href="css/style.css" />
        <link rel="icon" href="img/univerdict-favicon-white.png" type="image/x-icon"> <!-- To see favicon, load this file only -->
        <title>UniVerdict</title>
        <style>
            body {
                font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
            }

            table {
                width: 70%;
                font-size: 1.2rem;
                border: none;
                background-color: #fce8d7;
                box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            }

            tr{
                font-style: bold;
            }
            th, td {
                padding: 12px;
                text-align: left;
                border-bottom: 1px solid #ddd;
            }

            th:first-child, td:first-child {
                width: 30%; /* Adjust as needed */
            }

            th:last-child, td:last-child {
                width: 70%; /* Adjust as needed */
            }

            tr:hover {
                background-color: #f5f5f5;
            }

            th {
                background-color: #f2f2f2;
            }

            a {
                color: #007bff;
                text-decoration: none;
            }

            a:hover {
                text-decoration: underline;
            }

            .center {
                text-align: center;
            }     

            .about-hero{ 
                padding-bottom: 20rem;
            }
        </style>
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

        <main>
            <section class="section-about-hero">
                <div class="about-hero">
                    <h1 class="heading-primary">To add a resource, please login</h1>


                    <center> <h1>Resources</h1>
                        <table border = "6" class="center" style="border-color: white; font-family:'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;">
                            <tr>
                                <td>Resource Name</td>
                                <td>Resource Link</td>
                            </tr>
<%--Comment Start
                            <%
                                try {
                                    Class.forName("com.mysql.cj.jdbc.Driver");
                                    //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/UniVerdict?autoReconnect=true&useSSL=false", "root", "student");
                                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/UniVerdict?autoReconnect=true&useSSL=false", "root", "student123");
                                    PreparedStatement ps_read = con.prepareStatement("SELECT * FROM Resources");
                                    ResultSet rs = ps_read.executeQuery();

                                    while (rs.next()) {
                            %>
                            <tr>
                                <td><%=rs.getString("resourceName")%></td> 
                                <td><a href="<%=rs.getString("resourceLink")%>"><%=rs.getString("resourceLink")%></a></td>
                            </tr>
                            <%

                                    }
                                } catch (Exception e) {
                                    System.out.println("did not work");
                                }

                            %>
Comment End--%>
                            
                        </table>
                    </center>
                </div>
            </section>
        </main>
    </body>
</html>
