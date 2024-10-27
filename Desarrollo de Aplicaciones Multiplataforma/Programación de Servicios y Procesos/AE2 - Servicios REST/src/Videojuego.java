package com.example.demo;

public class Videojuego {
    private int id;
    private String nombre;
    private String compania;
    private float nota;

    public Videojuego(int id, String nombre, String compania, float nota) {
        this.id = id;
        this.nombre = nombre;
        this.compania = compania;
        this.nota = nota;
    }

    // Getters y setters
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

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
}
