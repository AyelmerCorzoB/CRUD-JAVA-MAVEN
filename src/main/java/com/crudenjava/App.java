package com.crudenjava;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        EstudianteService estudianteService = new EstudianteService();
        Scanner inp = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n --CRUD DE EJEMPLO AYELMER ---");
            System.out.println("1. Agregar Estudiante");
            System.out.println("2. Listar Estudiantes");
            System.out.println("3. Actualizar Estudiante");
            System.out.println("4. Eliminar Estudiante");
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
                    System.out.print("Grado: ");
                    String grado = inp.nextLine();
                    estudianteService.agregarEstudiante(new Estudiante(id, nombre, grado));
                    break;
                case 2:
                    estudianteService.listarEstudiantes();
                    break;
                case 3:
                    System.out.print("ID del estudiante a actualizar: ");
                    int idActualizar = inp.nextInt();
                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre = inp.nextLine();
                    System.out.print("Nuevo Grado: ");
                    String nuevoGrado = inp.nextLine();
                    estudianteService.actualizarEstudiante(idActualizar, nuevoNombre, nuevoGrado);
                    break;
                case 4:
                    System.out.print("Id del estudiante a eliminar: ");
                    int idEliminar = inp.nextInt();
                    estudianteService.eliminarEstudiante(idEliminar);
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