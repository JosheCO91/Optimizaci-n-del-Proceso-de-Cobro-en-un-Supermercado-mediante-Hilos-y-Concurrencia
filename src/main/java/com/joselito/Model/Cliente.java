package com.joselito.Model;

import java.util.List;

/**
 * Clase cliente.
 */
public class Cliente {
    private final String nombre;
    private final List<Producto> productos;

    /**
     * Constructor.
     * 
     * @param nombre    Nombre del cliente.
     * @param productos Lista de productos que el cliente quiere comprar.
     */
    public Cliente(String nombre, List<Producto> productos) {
        this.nombre = nombre;
        this.productos = productos;
    }

    /**
     * Obtiene el nombre del cliente.
     * 
     * @return Nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la lista de productos a comprar.
     * 
     * @return Lista de productos.
     */
    public List<Producto> getProductos() {
        return productos;
    }
}


