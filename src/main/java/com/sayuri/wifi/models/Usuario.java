package com.sayuri.wifi.models;

public class Usuario extends Persona{
    private String direccion;

    public Usuario(){super();}

    public Usuario(String nombre, String apellido, String direccion) {
        super(nombre, apellido);
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "direccion='" + direccion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
