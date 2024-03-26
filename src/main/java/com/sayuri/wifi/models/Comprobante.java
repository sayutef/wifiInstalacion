package com.sayuri.wifi.models;

import java.time.LocalDateTime;

public class Comprobante {
    private String nombreUsuario;
    private String nombrePaquete;
    private double totalPago;
    private LocalDateTime fecha;
    private int noTicket;

    private static int contadorTickets = 0;

    public Comprobante(String nombreUsuario, String nombrePaquete, double totalPago, LocalDateTime fecha) {
        this.nombreUsuario = nombreUsuario;
        this.nombrePaquete = nombrePaquete;
        this.totalPago = totalPago;
        this.fecha = fecha;
        this.noTicket = ++contadorTickets;
    }

    public Comprobante() {
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getNombrePaquete() {
        return nombrePaquete;
    }

    public double getTotalPago() {
        return totalPago;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public int getNoTicket() {
        return noTicket;
    }
    @Override
    public String toString() {
        return "Comprobante{" +
                "nombreUsuario='" + nombreUsuario + '\'' +
                ", nombrePaquete='" + nombrePaquete + '\'' +
                ", totalPago=" + totalPago +
                ", fecha=" + fecha +
                ", noTicket=" + noTicket +
                '}';
    }
}
