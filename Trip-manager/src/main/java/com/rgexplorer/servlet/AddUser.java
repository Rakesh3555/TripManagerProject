package com.rgexplorer.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rgexplorer.model.BookingPojo;
import com.rgexplorer.util.RgDataBaseManager;

@WebServlet("/Adduser")
public class AddUser extends HttpServlet {
    private static final long serialVersionUID = 1L;

    
    private static final String DB_URL = "jdbc:mysql://localhost:3308/RG_database";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String[] textBoxValues = request.getParameterValues("textBox[]");

        
        Connection connect = null;
        PreparedStatement build = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            
            connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            
            String sql = "INSERT INTO travellerInformantion Travellers VALUES (?)";
            build = connect.prepareStatement(sql);

            if (textBoxValues != null) {
                for (String value : textBoxValues) {
                    build.setString(1, value);
                    build.executeUpdate();
          
                    BookingPojo bp = new BookingPojo();
                    RgDataBaseManager.TravellerDestination(bp);
                }
                
                
            }



        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            
        } finally {
            
            try {
                if (build != null) build.close();
                if (connect != null) connect.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
