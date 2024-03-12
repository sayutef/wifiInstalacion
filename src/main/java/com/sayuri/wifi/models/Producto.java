package com.sayuri.wifi.models;

public class Producto {
    protected String nombre;
    protected int costo;

    public Producto(){}
    public Producto(String nombre, int costo){
        this.nombre = nombre;
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", costo=" + costo +
                '}';
    }

}
