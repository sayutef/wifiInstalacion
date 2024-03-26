package com.sayuri.wifi.models;

public class Mastil extends Producto{
    private String material;
    private int altura;

    public Mastil(String material, int altura) {
        this.material = material;
        this.altura = altura;
    }

    public Mastil(String nombre, int costo, String material, int altura) {
        super(nombre, costo);
        this.material = material;
        this.altura = altura;
    }

    public String getMaterial() {
        return material;
    }

    public int getAltura() {
        return altura;
    }
}
