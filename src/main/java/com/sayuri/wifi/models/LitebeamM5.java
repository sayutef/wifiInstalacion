package com.sayuri.wifi.models;

public class LitebeamM5 extends Producto{
    private String tipoConexion;
    private String potenciaTransmicion;

    public LitebeamM5(String nombre, double costo, String tipoConexion, String potenciaTransmicion) {
        super(nombre, costo);
        this.tipoConexion = tipoConexion;
        this.potenciaTransmicion = potenciaTransmicion;
    }
}
