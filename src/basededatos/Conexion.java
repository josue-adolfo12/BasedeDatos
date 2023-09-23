package basededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private Connection con = null;
    public static final String URL = "jdbc:mysql://localhost:3306/bdnegocio";
    public static final String USER = "root";
    public static final String PASSWORD = "";

    public Connection getConection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con =(Connection) DriverManager.getConnection(this.URL, this.USER, this.PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("No se pudo establecer la conexión. Error: " + e);
        }
        
        return con;
    }
}   
