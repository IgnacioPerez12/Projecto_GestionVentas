package com.ceep.domain;

import java.util.Scanner;

/**
 *
 * @author Ignacio Pérez Jiménez
 */
public class Orden extends Producto{
   
    private final int idOrden;
    Producto productos[];
    private static int contadorOrdenes;
    private static int contadorProductos;
    private static final int max_productos = 10;

   
    //Constructores
    public Orden() {
        contadorProductos = 0;
        productos = new Producto[max_productos];
        this.idOrden = ++Orden.contadorOrdenes;
    }
    
    
    //Metodo AgregarProducto
    public void agregarProducto(Producto producto){
        if (Orden.contadorProductos < Orden.max_productos){
            productos[Orden.contadorProductos++] = producto;
        }else{
            System.out.println("Has llegado al maximo de productos por Orden de " + Orden.max_productos);
        }
    }
    
    //Metodo CalcularTotal
    public double calcularTotal(){
        var suma = 0.0;
        for (int i = 0; i < Orden.contadorProductos; i++) {
            suma+= productos[i].getPrecio();
        }
        return suma;
    }
    
    //Metodo mostrar
    public  void mostrarOrden(){
        System.out.println("\n----------------------\n\n" + "ID de Orden: " + this.idOrden + "\n");
        for (int i = 0; i < Orden.contadorProductos; i++) {
            System.out.println("ID Producto: " + productos[i].getIdProducto() + " ||| Nombre producto: " + productos[i].getNombre() + " ||| Precio producto: " + productos[i].getPrecio());
            System.out.println("");
        }
        System.out.println("Total: " + calcularTotal() + " €");
    }
}
