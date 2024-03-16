package com.sayuri.wifi.models;

public class Mastil extends Producto{
    private String material;
    private int altura;

    public Mastil(String nombre, double costo, String material, int altura) {
        super(nombre, costo);
        this.material = material;
        this.altura = altura;
    }
}
