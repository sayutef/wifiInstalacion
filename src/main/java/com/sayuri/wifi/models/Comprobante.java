package com.sayuri.wifi.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Comprobante {
    private String nombreUsuario;
    private String nombrePaquete;
    private double totalPago;
    private LocalDateTime fecha;
    private int noTicket;
    private int noTicketI;

    public Comprobante(String nombreUsuario, String nombrePaquete, double totalPago, LocalDateTime fecha, int noTicket) {
        this.nombreUsuario = nombreUsuario;
        this.nombrePaquete = nombrePaquete;
        this.totalPago = totalPago;
        this.fecha = fecha;
        this.noTicket = noTicket;
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
    public int incrementarNoTicket() {
        return ++noTicketI;
    }
    @Override
    public String toString() {
        return "Comprobante{" +
                "nombreUsuario='" + nombreUsuario + '\'' +
                ", nombrePaquete='" + nombrePaquete + '\'' +
                ", totalPago=" + totalPago +
                ", fecha=" + fecha +
                ", noTicket=" + noTicket +
                ", noTicketI=" + noTicketI +
                '}';
    }
}
