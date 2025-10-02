/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeup.getion_alquiler_vehiculos.modelo;
import java.time.LocalDateTime;
/**
 *
 * @author Coder
 */
public class Alquiler {

    private String id;
    private Usuario usuario;
    private Vehiculo vehiculo;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private double kmRecorridos;
    private double costoTotal;

    // Constructores

    public Alquiler(String id, Usuario usuario, Vehiculo vehiculo, LocalDateTime fechaInicio, LocalDateTime fechaFin, double kmRecorridos, double costoTotal) {
        this.id = id;
        this.usuario = usuario;
        this.vehiculo = vehiculo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.kmRecorridos = kmRecorridos;
        this.costoTotal = costoTotal;
    }
    //contructor vacio
    public Alquiler() {}

    
    //getters y setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "id=" + id + ", usuario=" + usuario + ", vehiculo=" + vehiculo + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", kmRecorridos=" + kmRecorridos + ", costoTotal=" + costoTotal + '}';
    }
    
}


