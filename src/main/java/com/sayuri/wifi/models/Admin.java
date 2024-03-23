package com.sayuri.wifi.models;
public class Admin {
    private String user= "Admin1";
    private String contraseña = "Admin2024";
    private Administrador admin = new Administrador();

    // Getters y setters

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Administrador getAdmin() {
        return admin;
    }

    public void setAdmin(Administrador admin) {
        this.admin = admin;
    }
}

