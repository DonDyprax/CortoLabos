/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author LN710Q
 */
public class Filtro {
    private int id, cantidad;
    private String codigo, nombre, tipo;
    private double precio;
    private boolean disponibilidad;

    
    public Filtro(){
        
    }
    
    public Filtro(int id, String codigo, String nombre, String tipo, boolean disponibilidad, double precio, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.codigo = codigo;
        this.tipo = tipo;
        this.disponibilidad = disponibilidad;
        this.precio = precio;
        this.cantidad = cantidad;      
       
    }
    
    public Filtro(String codigo, String nombre, String tipo, boolean disponibilidad, double precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.disponibilidad = disponibilidad;
        this.precio = precio;
        this.cantidad = cantidad;

    }
    
    public Filtro(String nombre, int cantidad, boolean disponibilidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.disponibilidad = disponibilidad;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;    
    }    
    
}
