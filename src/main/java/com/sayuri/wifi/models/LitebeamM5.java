package com.sayuri.wifi.models;

public class LitebeamM5 extends Producto{
    private String tipoConexion;
    private String potenciaTransmicion;

    public LitebeamM5(){super();}

    public LitebeamM5(String nombre, int costo, String tipoConexion, String potenciaTransmicion) {
        super(nombre, costo);
        this.tipoConexion = tipoConexion;
        this.potenciaTransmicion = potenciaTransmicion;
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

    public String getTipoConexion() {
        return tipoConexion;
    }

    public void setTipoConexion(String tipoConexion) {
        this.tipoConexion = tipoConexion;
    }

    public String getPotenciaTransmicion() {
        return potenciaTransmicion;
    }

    public void setPotenciaTransmicion(String potenciaTransmicion) {
        this.potenciaTransmicion = potenciaTransmicion;
    }
}
