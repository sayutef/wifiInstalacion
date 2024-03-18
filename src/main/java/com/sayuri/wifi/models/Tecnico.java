package com.sayuri.wifi.models;

public class Tecnico extends Persona{
    private int telefono;
    public Tecnico(){super();}

    public Tecnico(String nombre, String apellido, int telefono) {
        super(nombre, apellido);
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "telefono=" + telefono +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
