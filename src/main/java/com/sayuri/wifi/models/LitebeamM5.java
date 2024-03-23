package com.sayuri.wifi.models;

public class LitebeamM5 extends Producto{
    private String tipoConexion;
    private String potenciaTransmicion;

    public LitebeamM5(String tipoConexion, String potenciaTransmicion) {
        this.tipoConexion = tipoConexion;
        this.potenciaTransmicion = potenciaTransmicion;
    }

    public LitebeamM5(String nombre, int costo, String tipoConexion, String potenciaTransmicion) {
        super(nombre, costo);
        this.tipoConexion = tipoConexion;
        this.potenciaTransmicion = potenciaTransmicion;
    }

    public String getTipoConexion() {
        return tipoConexion;
    }

    public String getPotenciaTransmicion() {
        return potenciaTransmicion;
    }

    @Override
    public String toString() {
        return "LitebeamM5{" +
                "tipoConexion='" + tipoConexion + '\'' +
                ", potenciaTransmicion='" + potenciaTransmicion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", costo=" + costo +
                '}';
    }
}
