/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mtto_telec_project;

import java.sql.Connection;
import Logica.*;

public class Mtto_telec_project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Conexion cx = new Conexion();
            Connection con = cx.getConexion();
            Conductor drvr = new Conductor();
            
            drvr.setApellidos("Plazas Romero");
            drvr.setBarrio("Nueva Zelandia");
            drvr.setCategoriaLicencia("B");
            drvr.setCelular("3143605335");
            drvr.setTelefono("4567899");
            drvr.setCiudadDeResidencia("Bogotá");
            drvr.setCodigoVehiculoAsignado(1);
            drvr.setCorreoElectronico("mplazasr@unal.edu.co");
            drvr.setDireccion("Kr 48A 26 06");
            drvr.setEstadoCivil("Casada");
            drvr.setFechaDeNacimiento("2000-10-27");
            drvr.setGenero("Femenino");
            drvr.setIdentificacion("1000132837");
            drvr.setNombres("Mariana");
            drvr.setNumeroLicencia("AAA294");
            drvr.setTurno("Mañana");
            
            drvr.CrearConductor();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
