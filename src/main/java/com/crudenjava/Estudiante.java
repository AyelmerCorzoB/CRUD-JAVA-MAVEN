package com.crudenjava;

public class Estudiante {
    private int id;
    private String nombre;
    private String grado;

    public Estudiante(int id, String nombre, String grado) {
        this.id = id;
        this.nombre = nombre;
        this.grado = grado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    @Override
    public String toString() {
        return "=============================\n" +
                "     Detalles del Estudiante   \n" +
                "=============================\n" +
                "ID:          " + id + "\n" +
                "Nombre:      " + nombre + "\n" +
                "Grado:      " + grado + "\n" +
                "=============================";
    }

}
