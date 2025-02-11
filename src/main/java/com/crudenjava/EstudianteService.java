package com.crudenjava;

import java.util.ArrayList;
import java.util.List;

public class ProductoService {
    private List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println(producto);
    }

    public void listarProductos() {
        System.out.println("Lista de productos: ");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public void actualizarProducto(int id, String nuevoNombre, double nuevoPrecio) {
        for(Producto producto : productos) {
            if(producto.getId() == id){
                producto.setNombre(nuevoNombre);
                producto.setPrecio(nuevoPrecio);
                System.out.println("Producto Actualizado: "+producto);
                return;
            }
        }
        System.out.println("Producto con ID " +id + "no encontrado.");
    }

    public void eliminarProducto(int id){
        productos.removeIf(producto -> producto.getId()== id);
        System.out.println("Producto con ID " + id + " Eliminado.");
    }
}
