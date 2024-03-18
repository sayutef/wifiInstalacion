package com.sayuri.wifi.models;

import java.util.ArrayList;

public class Administrador {
    private ArrayList<Persona>ListPersona = new ArrayList<>();
    public boolean addPersona (Persona persona){return ListPersona.add(persona);}
    public ArrayList<Persona> getListPersona() {
        return ListPersona;
    }

    public void setListPersona(ArrayList<Persona> listPersona) {
        ListPersona = listPersona;
    }
}
