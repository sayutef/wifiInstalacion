package com.sayuri.wifi.models;

public class SuperAdmin {
    private String user = "SuperAdmin1";
    private String contraseña = "SuperAdmin2024";
    private Administrador admin = new Administrador();

    public String getUser() {
        return user;
    }

    public String getContraseña() {
        return contraseña;
    }
    public Administrador getAdmin() {
        return admin;
    }

    public void setAdmin(Administrador admin) {
        this.admin = admin;
    }

}
