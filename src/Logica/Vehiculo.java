/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
import java.sql.Timestamp;

public class Vehiculo {
    // static Connection con;
    // static Conexion cx;
    
    private int codigoVehiculo;
    private String placa;
    private String tipo;
    private String marca;
    private String modelo;
    private String descripcion;
    private Timestamp inicioOperacion;
    private String estadoAsignacion;
    
    // Setters y getters para cada propiedad
    // Código de vehiculo
    public int getCodigoVehiculo() {
        return this.codigoVehiculo;
    }
    
    public void setCodigoVehiculo(int codigoVehiculo) {
        this.codigoVehiculo = codigoVehiculo;
    }
    
    // Placa
    public String getPlaca() {
        return this.placa;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    // Tipo
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    // Marca
    public String getMarca() {
        return this.marca;
    }
    
    public void setMarca(String tipo) {
        this.marca = marca;
    }
    
    // Modelo
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    // Descripción
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    // Inicio de operación
    public Timestamp getInicioOperacion() {
        return this.inicioOperacion;
    }
    
    public void setInicioOperacion(Timestamp inicioOperacion) {
        this.inicioOperacion = inicioOperacion;
    }
    
    // Estado de asignación
    public String getEstadoAsignacion() {
        return this.estadoAsignacion;
    }
    
    public void setEstadoAsignacion(String estadoAsignacion) {
        this.estadoAsignacion = estadoAsignacion;
    }
    
    // Create Vehiculo
    // Read Vehiculo
    // Update Vehiculo
    // Delete Vehiculo    
}
