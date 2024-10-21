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
 * @author nivaetheepan
 */
@WebServlet(name = "AddCourse", urlPatterns = {"/AddCourse"})
public class AddCourse extends HttpServlet {

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
            System.out.println("does not work");
        }
        return con;
    }
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        PrintWriter pw = response.getWriter();
        response.setContentType("text/html");
        
        String cName = request.getParameter("courseName");
        String cDescription = request.getParameter("courseDescription");
        String cRating = request.getParameter("courseRating");
        System.out.println(cName + cDescription + cRating); 
        
        try
        {
            Connection con = getCon();
            PreparedStatement ps = con.prepareStatement("INSERT INTO Courses (courseName, courseDescription,courseRating) VALUES (?, ?, ?)");
            
            System.out.println("loading data");
            ps.setString(1, cName);
            ps.setString(2, cDescription);
            ps.setString(3, cRating);
            
            int count = ps.executeUpdate();
                
                if(count == 0)
                {
                    System.out.println("Error occurred when recording data");
                }
                else
                {
                    System.out.println("All data recorded");
                    
                }
        }
        catch (Exception e)
        {
            System.out.println(e);
            System.out.println("Not working - AddCourse.java");
        }
        request.getRequestDispatcher("coursesList.jsp").forward(request, response);
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        doPost(request, response);
    
    }

}
