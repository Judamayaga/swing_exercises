/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mtto_telec_project;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class Mtto_telec_project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try {
            Logica.Conexion cx = new Logica.Conexion();
            Connection con = cx.getConexion();
            
            PreparedStatement stmt = con.prepareStatement("UPDATE vehiculos SET placa = 'RGL-123' WHERE (idVehiculos = 1)");
            stmt.executeUpdate();
            stmt.close();
            con.close();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
