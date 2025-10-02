/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeup.getion_alquiler_vehiculos.modelo;

/**
 *
 * @author Coder
 */
public class Bicicleta {
    private String id;
    private String marca;
    private String modelo;
    private boolean disponible;

    // Constructor(es), getters y setters

    
    // Implementación de métodos de Vehiculo
   /* @Override
    public String getTipo() {
        return "BICICLETA";
    }

    @Override
    public void acelerar(int kmh) {
        // lógica para acelerar (simulada)
        System.out.println("La bicicleta acelera a " + kmh + " km/h");
    }

    @Override
    public void frenar() {
        // lógica para frenar (simulada)
        System.out.println("La bicicleta frena");
    }

    @Override
    public double calcularCostoUso(double kmRecorridos) {
        // ejemplo: costo fijo por km, por ejemplo 0.5 por km
        return 0.5 * kmRecorridos;
    }*/

    public Bicicleta(String id, String marca, String modelo, boolean disponible) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.disponible = disponible;
    }
    
    //constructor vacio
    public Bicicleta() {}
    
    //setter y getter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
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
        return "Bicicleta{" + "id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", disponible=" + disponible + '}';
    }
    
    
    
}


