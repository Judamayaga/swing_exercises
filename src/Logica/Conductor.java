/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.sql.Timestamp;

public class Conductor {
    String identificacion;
    String nombres;
    String apellidos;
    String genero;
    long telefono;
    long celular;
    Timestamp fechaDeNacimiento;
    String correoElectronico;
    String numeroLicencia;
    String categoriaLicencia;
    String turno;
    String ciudadDeResidencia;
    String direccion;
    String barrio;
    String estadoCivil;
    int codigoVehiculoAsignado;
    
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
    public long getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    
    // Celular;
    public long getCelular() {
        return this.celular;
    }
    
    public void setCelular(long celular) {
        this.celular = celular;
    }
    
    // Fecha De Nacimiento
    public Timestamp getFechaDeNacimiento() {
        return this.fechaDeNacimiento;
    }
    
    public void setFechaDeNacimiento(Timestamp fechaDeNacimiento) {
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
    
    // EstadoCivil
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
}
