package com.ceep.ventas;

import com.ceep.domain.*;

/**
 *
 * @author Ignacio Pérez Jiménez
 */
public class TestVentas {
    
    public static void main(String[] args) {
        
        //PEDIDO 1
        Producto prod1 = new Producto("Peras", 5.4);
        Producto prod2 = new Producto("Manzanas", 6.4);
        Producto prod3 = new Producto("Platanos", 10.2);
        
        Orden pedido1 = new Orden();
        
        pedido1.agregarProducto(prod1);
        pedido1.agregarProducto(prod2);
        pedido1.agregarProducto(prod3);
        
        pedido1.mostrarOrden();
        
        //PEDIDO 2
        Producto prod4 = new Producto("Balon", 15.4);
        Producto prod5 = new Producto("Coche", 66.4);
        Producto prod6 = new Producto("Kalise", 1.2);
        
        Orden pedido2 = new Orden();
        
        pedido2.agregarProducto(prod4);
        pedido2.agregarProducto(prod5);
        pedido2.agregarProducto(prod6);
        
        pedido2.mostrarOrden();
    }
}
