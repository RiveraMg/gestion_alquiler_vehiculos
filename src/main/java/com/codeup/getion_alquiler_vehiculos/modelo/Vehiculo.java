/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.codeup.getion_alquiler_vehiculos.modelo;

/**
 *
 * @author Coder
 */
public interface Vehiculo {

    String getTipo();
    void acelerar(int kmh);
    void frenar();
    double calcularCostoUso(double kmRecorridos);
}

    

