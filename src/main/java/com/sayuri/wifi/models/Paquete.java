package com.sayuri.wifi.models;

public class Paquete {
    private int costo;
    private String nombre;
    private String descripcion;

    public Paquete(int costo, String nombre, String descripcion) {
        this.costo = costo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Paquete{" +
                "costo=" + costo +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}