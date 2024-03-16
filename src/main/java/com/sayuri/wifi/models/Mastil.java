package com.sayuri.wifi.models;

public class Mastil extends Producto{
    private String material;
    private int altura;

    public Mastil() {
        super();
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
