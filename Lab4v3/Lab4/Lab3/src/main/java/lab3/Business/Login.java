package lab3.Business;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author student
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    private static final String jdbcURL = ("jdbc:mysql://localhost:3306/UniVerdict?autoReconnect=true&useSSL=false");
    private static final String jdbcUsername = "root";
    private static final String jdbcPassword = "student";
//    private static final String jdbcPassword = "student123";
    private static final String jdbcDriver = "com.mysql.jdbc.Driver";


    private static Connection getCon() {
        Connection con = null;
   
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
            System.out.println("Connection established.");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("does not work - Login.java");
        }
        return con;
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

         String username = request.getParameter("username");
         String password = request.getParameter("password");
         System.out.println(username + password);

         if (username != null && password != null) {
             //For User Accounts
             try {
                 Connection con = getCon();
                 PreparedStatement ps_user = con.prepareStatement("SELECT userName FROM UserCred WHERE userName=? AND userPass=?");
                 ps_user.setString(1, username);
                 ps_user.setString(2, password);
                 ResultSet rs_user = ps_user.executeQuery();
                 if (rs_user.next()) {
                     request.getRequestDispatcher("userWelcome.jsp").forward(request, response);
                     System.out.println("worked");
                 }
             } catch (Exception e) {
                 System.out.println(e);
                 System.out.println("Not working - Login.java");
             }
             
             
             //For Admin Accounts
             try {
                 Connection con = getCon();
                 PreparedStatement ps_admin = con.prepareStatement("SELECT adminUser FROM AdminCred WHERE adminUser=? AND adminPass=?");
                 ps_admin.setString(1, username);
                 ps_admin.setString(2, password);
                 ResultSet rs_admin = ps_admin.executeQuery();
                 if (rs_admin.next()) {
                     request.getRequestDispatcher("welcome.jsp").forward(request, response);
//                     response.sendRedirect("welcome.jsp");
                 }
             } catch (Exception e) {
                 System.out.println(e);
             }
             
         } else {
             // Empty username or password, set error message and forward to login page
             request.setAttribute("errorMessage", "Please enter both username and password.");
             request.getRequestDispatcher("Login.jsp").forward(request, response);
         }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

}
