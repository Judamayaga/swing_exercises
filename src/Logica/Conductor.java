/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Conductor {
    // Propiedades para Base de datos
    static Connection con;
    static Conexion cx;
    
    // Propiedades de clase
    private String identificacion;
    private String nombres;
    private String apellidos;
    private String genero;
    private String telefono;
    private String celular;
    private String fechaDeNacimiento;
    private String correoElectronico;
    private String numeroLicencia;
    private String categoriaLicencia;
    private String turno;
    private String ciudadDeResidencia;
    private String direccion;
    private String barrio;
    private String estadoCivil;
    private int codigoVehiculoAsignado;
    
    // Identificación
    public String getIdentificacion() {
        return this.identificacion;
    }
    
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    
    // Nombres
    public String getNombres() {
        return this.nombres;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
    // Apellidos
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    // Genero
    public String getGenero() {
        return this.genero;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    // Telefono;
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    // Celular;
    public String getCelular() {
        return this.celular;
    }
    
    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    // Fecha De Nacimiento
    public String getFechaDeNacimiento() {
        return this.fechaDeNacimiento;
    }
    
    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
    // Correo Electronico
    public String getCorreoElectronico() {
        return this.correoElectronico;
    }
    
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
    // Numero Licencia
    public String getNumeroLicencia() {
        return this.numeroLicencia;
    }
    
    public void setNumeroLicencia(String numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }
    
    // Categoria Licencia
    public String getCategoriaLicencia() {
        return this.categoriaLicencia;
    }
    
    public void setCategoriaLicencia(String categoriaLicencia) {
        this.categoriaLicencia = categoriaLicencia;
    }
    
    // Turno
    public String getTurno() {
        return this.turno;
    }
    
    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    // Ciudad De Residencia
    public String getCiudadDeResidencia() {
        return this.ciudadDeResidencia;
    }
    
    public void setCiudadDeResidencia(String ciudadDeResidencia) {
        this.ciudadDeResidencia = ciudadDeResidencia;
    }
    
    // Direccion
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    // Barrio
    public String getBarrio() {
        return this.barrio;
    }
    
    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }
    
    // Estado Civil
    public String getEstadoCivil() {
        return this.estadoCivil;
    }
    
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    // Codigo Vehiculo Asignado
    public int getCodigoVehiculoAsignado() {
        return this.codigoVehiculoAsignado;
    }
    
    public void setCodigoVehiculoAsignado(int codigoVehiculoAsignado) {
        this.codigoVehiculoAsignado = codigoVehiculoAsignado;
    }
    
    // Create Conductor
    public boolean CrearConductor() {
        try {
            cx = new Conexion();
            con = cx.getConexion();
            PreparedStatement stmnt = con.prepareStatement(
                "INSERT INTO conductores (identificacion, nombres, apellidos, genero, telefono, celular, "
                + "fecha_de_nacimiento, correo_electronico, numero_licencia, categoria_licencia, turno, ciudad_de_residencia, "
                + "direccion, barrio, estado_civil, codigo_vehiculo_asignado)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
            );

            stmnt.setString(1, this.identificacion);
            stmnt.setString(2, this.nombres);
            stmnt.setString(3, this.apellidos);
            stmnt.setString(4, this.genero);
            stmnt.setString(5, "" + this.telefono);
            stmnt.setString(6, "" + this.celular);
            stmnt.setString(7, "" + this.fechaDeNacimiento);
            stmnt.setString(8, this.correoElectronico);
            stmnt.setString(9, this.numeroLicencia);
            stmnt.setString(10, this.categoriaLicencia);
            stmnt.setString(11, this.turno);
            stmnt.setString(12, this.ciudadDeResidencia);
            stmnt.setString(13, this.direccion);
            stmnt.setString(14, this.barrio);
            stmnt.setString(15, this.estadoCivil);
            stmnt.setString(16, "" + this.codigoVehiculoAsignado);

            stmnt.executeUpdate();
            stmnt.close();
            con.close();

            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    // Read Vehiculo
    // Update Vehiculo
    // Delete Vehiculo
}
