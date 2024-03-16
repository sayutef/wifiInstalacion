package com.sayuri.wifi.models;

public class Modem extends Producto{
    private int velocidad;
    private String tipoModem;

    public Modem(String nombre, double costo, int velocidad, String tipoModem) {
        super(nombre, costo);
        this.velocidad = velocidad;
        this.tipoModem = tipoModem;
    }

    @Override
    public String toString() {
        return "Modem{" +
                "velocidad=" + velocidad +
                ", tipoModem='" + tipoModem + '\'' +
                ", nombre='" + nombre + '\'' +
                ", costo=" + costo +
                '}';
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getTipoModem() {
        return tipoModem;
    }

    public void setTipoModem(String tipoModem) {
        this.tipoModem = tipoModem;
    }
}
