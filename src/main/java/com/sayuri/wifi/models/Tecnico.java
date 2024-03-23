package com.sayuri.wifi.models;

public class Tecnico extends Persona{
    private String telefono;
    public Tecnico(){super();}

    public Tecnico(String nombre, String apellido, String telefono) {
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
