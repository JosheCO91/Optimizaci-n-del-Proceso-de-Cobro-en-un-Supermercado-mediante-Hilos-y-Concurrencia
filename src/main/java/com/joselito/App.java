package com.joselito;

import java.util.ArrayList;
import java.util.List;

import com.joselito.Model.Cajera;
import com.joselito.Model.Cliente;
import com.joselito.Model.Producto;

/**
 * Clase principal que simula el proceso de cobro.
 */
public class App {

    public static void main(String[] args) {

        // Crear productos para los clientes.
        List<Producto> productos = new ArrayList<>();
        setProductos(productos);

        // Crear clientes.
        Cliente cliente1 = new Cliente("Juan", productos);
        Cliente cliente2 = new Cliente("Ana", productos);
        Cliente cliente3 = new Cliente("Jose", productos);
        Cliente cliente4 = new Cliente("Marcos", productos);
        Cliente cliente5 = new Cliente("Amparo", productos);

        // Crear cada cajera.
        long tiempoInicial = System.currentTimeMillis();
        Cajera cajera1 = new Cajera("cajera 1 ", cliente1, tiempoInicial);
        Cajera cajera2 = new Cajera("cajera 2 ", cliente2, tiempoInicial);
        Cajera cajera3 = new Cajera("cajera 3 ", cliente3, tiempoInicial);
        Cajera cajera4 = new Cajera("cajera 4 ", cliente4, tiempoInicial);
        Cajera cajera5 = new Cajera("cajera 5 ", cliente5, tiempoInicial);

        // Iniciar hilos.
        cajera1.start();
        cajera2.start();
        cajera3.start();
        cajera4.start();
        cajera5.start();

        System.out.println("Todas las compras han sido procesadas.");
    }

    // Setear los productos.
    public static void setProductos(List<Producto> productos) {
        Producto carritoDeCompraUno = new Producto("Manzanas", 3500, 3);
        Producto carritoDeCompraDos = new Producto("Pan", 1200, 5);
        Producto carritoDeCompraTres = new Producto("Leche", 2800, 2);
        Producto carritoDeCompraCuatro = new Producto("Cereal", 6500, 1);
        Producto carritoDeCompraCinco = new Producto("Aceite", 5000, 1);

        Producto carritoDeCompraSeis = new Producto("Carne", 12000, 2);
        Producto carritoDeCompraSiete = new Producto("Arroz", 4500, 3);
        Producto carritoDeCompraOcho = new Producto("Huevos", 3000, 12);
        Producto carritoDeCompraNueve = new Producto("Azúcar", 1500, 4);

        productos.add(carritoDeCompraUno);
        productos.add(carritoDeCompraDos);
        productos.add(carritoDeCompraTres);
        productos.add(carritoDeCompraCuatro);
        productos.add(carritoDeCompraCinco);

        productos.add(carritoDeCompraSeis);
        productos.add(carritoDeCompraSiete);
        productos.add(carritoDeCompraOcho);
        productos.add(carritoDeCompraNueve);
    }
}
