package com.joselito.Model;

/**
 * Clase cajera encargada de procesar compras.
 * Extiende de la clase Thread.
 */
public class Cajera extends Thread {
    
    private final String nombre;
    private final Cliente cliente;
    private final long tiempIni;

    /**
     * Constructor.
     * 
     * @param nombre  Nombre de la cajera.
     * @param cliente Cliente asignado a la cajera.
     * @param tiempIni Tiempo inicial.
     */
    public Cajera(String nombre, Cliente cliente, long tiempIni) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.tiempIni = tiempIni;
    }   

    /**
     * Método para el procesamiento de las compras.
     */
    @Override
    public void run() {
        System.out.println("La cajera "+ this.nombre 
        +" comienza proceso "+" ----- Tiempo estimado "+(System.currentTimeMillis() - this.tiempIni)/ 1000+" segundos");

        for (Producto producto: cliente.getProductos()) {
            this.espeXSeg();
            System.out.println(" Procesando compra del cliente : "+ cliente.getNombre()
            +" ___________ "
            +" Nombre producto: "+ producto.getNombre()
            +" ___________ "
            +" Precio producto: "+ producto.getPrecio()
            +" ___________ "
            +" Cantidad producto: "+ producto.getCantidad()
            +" ___________ "
            +" Costo total: "+ producto.getCantidad()*producto.getPrecio()
            +" ____________ "
            +" Tiempo estimado "+(System.currentTimeMillis() - this.tiempIni)/ 1000+" segundos");
        }
        System.out.println(" _______ ");
        System.out.println("Proceso finalizado ");
        System.out.println("Tiempo estimado "+(System.currentTimeMillis() - this.tiempIni)/ 1000+" segundos");
    }

    private void espeXSeg() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
        }
    }
    
}


