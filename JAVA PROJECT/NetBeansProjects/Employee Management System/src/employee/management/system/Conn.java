package employee.management.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;

    public Conn () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///employeemanagementsystem", "root", "verma");
            s = c.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
           // e.printStackTrace();
        }
    }
}