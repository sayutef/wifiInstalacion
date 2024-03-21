package com.sayuri.wifi.models;

import java.util.ArrayList;

public class Administrador {
    private ArrayList<Persona>ListPersona = new ArrayList<>();
    public boolean addPersona (Persona persona){return ListPersona.add(persona);}
    public ArrayList<Persona> getListPersona() {
        return ListPersona;
    }
    private ArrayList<Paquete> listPaquetes  = new ArrayList<>();
    private ArrayList<Comprobante> listComprobante = new ArrayList<>();

    public ArrayList<Comprobante> getListComprobante() {
        return listComprobante;
    }

    public boolean addComprobante (Comprobante comprobante){return listComprobante.add(comprobante);}
    public ArrayList<Paquete> getListPaquetes() {
        return listPaquetes;
    }
    public boolean addPaquete (Paquete paquete){return listPaquetes.add(paquete);}
    public void setListPersona(ArrayList<Persona> listPersona) {
        ListPersona = listPersona;
    }
}
