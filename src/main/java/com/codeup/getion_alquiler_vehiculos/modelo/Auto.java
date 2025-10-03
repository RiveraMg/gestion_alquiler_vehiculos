/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeup.getion_alquiler_vehiculos.modelo;

/**
 *
 * @author Coder
 */
public class Auto {
    private String id;
    private String modelo;
    private String marca;
    private String color;
    private String placa;
    private int año;
    private boolean disponible;
    
    //contructor vacio
    public Auto(){}
    
    //contructor

    public Auto(String id, String modelo, String marca, String color, String placa, int año, boolean disponible) {
        if (placa == null || placa.isBlank()) throw new IllegalArgumentException("Placa requerida obligatoriamente");
        
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.placa = placa;
        this.año = año;
        this.disponible = disponible;
    }
    
    //getter y setter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    //metodo toString

    @Override
    public String toString() {
        return "Auto{" + "id=" + id + ", modelo=" + modelo + ", marca=" + marca + ", color=" + color + ", placa=" + placa + ", a\u00f1o=" + año + ", disponible=" + disponible + '}';
    }
    
}

