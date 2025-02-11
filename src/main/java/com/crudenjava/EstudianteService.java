package com.crudenjava;

import java.util.ArrayList;
import java.util.List;

public class EstudianteService {
    private List<Estudiante> estudiantes = new ArrayList<>();

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
        System.out.println(estudiante);
    }

    public void listarEstudiantes() {
        System.out.println("Lista de estudiantes: ");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }

    public void actualizarEstudiante(int id, String nuevoNombre, String nuevoGrado) {
        for(Estudiante estudiante : estudiantes) {
            if(estudiante.getId() == id){
                estudiante.setNombre(nuevoNombre);
                estudiante.setGrado(nuevoGrado);
                System.out.println("Estudiante Actualizado: "+estudiante);
                return;
            }
        }
        System.out.println("Estudiante con ID " +id + "no encontrado.");
    }

    public void eliminarEstudiante(int id){
        estudiantes.removeIf(estudiante -> estudiante.getId()== id);
        System.out.println("Estudiante con ID " + id + " Eliminado.");
    }
}
