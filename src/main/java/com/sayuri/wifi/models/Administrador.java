package com.sayuri.wifi.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Administrador {
    private ArrayList<Persona> ListPersona = new ArrayList<>();
    private ArrayList<Paquete> listPaquetes = new ArrayList<>();
    private ArrayList<Comprobante> listComprobante = new ArrayList<>();
    private ArrayList<Producto> listProduct = new ArrayList<>();
    private SuperAdmin superAdmin;
    private Admin admin;
    public int contarCantidadProductos(String tipoProducto) {
        int contador = 0;
        for (Producto producto : listProduct) {
            if (obtenerTipoProducto(producto).equalsIgnoreCase(tipoProducto)) {
                contador++;
            }
        }
        return contador;
    }

    public boolean addPersona(Persona persona) {
        return ListPersona.add(persona);
    }
    public String obtenerTipoProducto(Producto producto) {
        return producto.getClass().getSimpleName();
    }
    public ArrayList<Persona> getListPersona() {
        return ListPersona;
    }

    public boolean addComprobante(Comprobante comprobante) {
        return listComprobante.add(comprobante);
    }

    public ArrayList<Comprobante> getListComprobante() {
        return listComprobante;
    }

    public boolean addPaquete(Paquete paquete) {
        return listPaquetes.add(paquete);
    }

    public ArrayList<Paquete> getListPaquetes() {
        return listPaquetes;
    }

    public boolean addProduct(Producto product) {
        return  listProduct.add(product);
    }

    public ArrayList<Producto> getListProduct() {
        return listProduct;
    }

    public boolean eliminarPaquete(String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < listPaquetes.size(); i++) {
            if (listPaquetes.get(i).getNombre().equals(nombre)) {
                encontrado = true;
                listPaquetes.remove(i);
            }
        }
        return encontrado;
    }

    public boolean eliminarProducto(String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getNombre().equals(nombre)) {
                encontrado = true;
                listProduct.remove(i);
            }
        }
        return encontrado;
    }

    public boolean eliminarComprobante(int noTicket) {
        boolean encontrado = false;
        for (int i = 0; i < listComprobante.size(); i++) {
            if (listComprobante.get(i).getNoTicket() == noTicket) {
                encontrado = true;
                listComprobante.remove(i);
            }
        }
        return encontrado;
    }

    public boolean eliminarPersonas(String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < ListPersona.size(); i++) {
            if (ListPersona.get(i).getNombre().equals(nombre)) {
                encontrado = true;
                ListPersona.remove(i);
            }
        }
        return encontrado;
    }
}
