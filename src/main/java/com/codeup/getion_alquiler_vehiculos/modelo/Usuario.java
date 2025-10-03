/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeup.getion_alquiler_vehiculos.modelo;

import java.util.UUID;

/**
 *
 * @author Coder
 */
public class Usuario {
    private UUID id;
    private String nombre;
    private String email;
    private String telefono;
    
    //contructor vacio
    public Usuario(){}

    //contructor
    public Usuario(String nombre, String email, String telefono) {
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("Nombre requerido obligatoriamente");
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }
    
    //setter y getter

    /*public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    //metodo toString

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", email=" + email +  ", telefono=" + telefono + '}';
    }
    
    
}
