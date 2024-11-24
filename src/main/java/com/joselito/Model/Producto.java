package com.joselito.Model;

/**
 * Clase producto.
 */
public class Producto {
    private final String nombre;
    private final double precio;
    private final int cantidad;
     

    /**
     * Constructor.
     * 
     * @param nombre              Nombre del producto.
     * @param precio              Precio del producto.
     * @param cantidad            Cantidad de productos
     */
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        
    }

    /**
     * Obtiene el nombre del producto.
     * 
     * @return Nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el precio del producto.
     * 
     * @return Precio del producto.
     */
    public double getPrecio() {
        return precio;
    }


     /**
     * Obtiene la cantidad de productos.
     * 
     * @return cantidad de productos.
     */
    public int getCantidad() {
        return cantidad;
    }
}

