package com.ceep.domain;

/**
 *
 * @author Ignacio Pérez Jiménez
 */
public class Producto {
    
    private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    
    //Contructor vacio    
    public Producto() {
        this.idProducto = ++Producto.contadorProductos;
    }
    
    //Constructor con todo
    public Producto(String nombre, double precio) {
        this();
        this.nombre = nombre;
        this.precio = precio;
    }
    
    //Getter and Setters
    public int getIdProducto() {
        return idProducto;
    }

    public final int setIdProducto(){
        return this.idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public final int getContadorProductos() {
        return this.contadorProductos;
    }

    public static void setContadorProductos(int aContadorProductos) {
        contadorProductos = aContadorProductos;
    }
    
    //ToString
    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    
}
