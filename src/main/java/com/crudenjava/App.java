package com.crudenjava;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        EstudianteService estudianteService = new EstudianteService();
        Scanner inp = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n --CRUD DE EJEMPLO AYELMER ---");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Listar Productos");
            System.out.println("3. Actualizar Producto");
            System.out.println("4. Eliminar Producto");
            System.out.println("5. Salir");
            System.out.print("Seleciona una opción:");
            opcion = inp.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("ID: ");
                    int id = inp.nextInt();
                    inp.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = inp.nextLine();
                    System.out.print("Precio: ");
                    double precio = inp.nextDouble();
                    estudianteServiceEstudianteService.agregarProducto(new Producto(id, nombre, precio));
                    break;
                case 2:
                    estudianteServiceEstudianteService.listarProductos();
                    break;
                case 3:
                    System.out.print("ID del producto a actualizar: ");
                    int idActualizar = inp.nextInt();
                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre = inp.nextLine();
                    System.out.print("Nuevo Precio: ");
                    double nuevoPrecio = inp.nextDouble();
                    estudianteServiceEstudianteService.actualizarProducto(idActualizar, nuevoNombre, nuevoPrecio);
                    break;
                case 4:
                    System.out.print("Id del producto a eliminar: ");
                    int idEliminar = inp.nextInt();
                    estudianteServiceEstudianteService.eliminarProducto(idEliminar);
                    break;
                case 5:
                    System.out.println("Saliendo del CRUD...");
                    break;
                default:
                System.out.println("Opcion no valida.");
                    break;
            }
        }while (opcion!=5);
        inp.close();
    }
}