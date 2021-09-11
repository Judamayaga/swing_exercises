/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
import java.sql.*;

public class Conexion {
    public Connection getConexion() {
        String driver = "com.mysql.cj.jdbc.Driver";
        String connectString = "jdbc:mysql://localhost:3306/mantenimiento-telec";
        String user = "root";
        String password = "";
        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(connectString, user, password);
            System.out.println("Conexión Exitosa");
            return con;
        } catch(Exception ex) {
            System.out.println("Error al abrir Conexión: " + ex.getMessage());
            return null;
        }
    }
}
