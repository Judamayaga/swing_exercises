/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
import java.sql.*;

public class Vehiculo {
    static Connection con;
    static Conexion cx;
    
    public boolean GuardarCliente() {
        try {
            cx = new Conexion();
            con = cx.getConexion();
            System.out.println(con);
        } catch(Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        
        return true;
    }
}
