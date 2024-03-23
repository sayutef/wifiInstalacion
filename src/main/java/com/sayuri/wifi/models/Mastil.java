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

    @Override
    public String toString() {
        return "Mastil{" +
                "material='" + material + '\'' +
                ", altura=" + altura +
                ", nombre='" + nombre + '\'' +
                ", costo=" + costo +
                '}';
    }
}
