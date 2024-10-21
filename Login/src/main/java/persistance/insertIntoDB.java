/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package persistance;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author nivaetheepan
 */
@WebServlet(name = "insertIntoDB", urlPatterns = {"/insertIntoDB"})
public class insertIntoDB extends HttpServlet {
    
    private static final String jdbcURL = ("jdbc:mysql://localhost:3306/UniVerdict?autoReconnect=true&useSSL=false");
    private static final String jdbcUsername = "root";
//    private static final String jdbcPassword = "student";
    private static final String jdbcPassword = "student123";
    private static final String jdbcDriver = "com.mysql.jdbc.Driver";


    private static Connection getCon() {
        Connection con = null;
   
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
            System.out.println("Connection established.");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("does not work");
        }
        return con;
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String newUser = request.getParameter("newUsername");
        String newPass = request.getParameter("newPassword");
        
          //For User Accounts
             try {
                 Connection con = getCon();
                 PreparedStatement ps_user = con.prepareStatement("INSERT INTO UserCred (userName, userPass) VALUES (?, ?);");
                 ps_user.setString(1, newUser);
                 ps_user.setString(2, newPass);
                 
                int count = ps_user.executeUpdate();
                
                if(count == 0)
                {
                    System.out.println("Error occurred when recording data");
                }
                else
                {
                    System.out.println("All data recorded");
                    
                    response.sendRedirect("Login.jsp");
                }
                
//                ps_user.close();
//                con.close();
                System.out.println("all user closed");
                
             } 
             catch (Exception e) {
                 System.out.println("did not work");
             }
         }
             
        }