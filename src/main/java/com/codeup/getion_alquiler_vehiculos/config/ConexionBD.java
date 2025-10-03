/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeup.getion_alquiler_vehiculos.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Coder
 */
public class ConexionBD {
    private static final String URL = "jdbc:mysql://localhost:3306/gestion_alquiler_vehiculos";
    private static final String USER = "root";
    private static final String PASSWORD = "Qwe.123*";
    
    public static Connection getConexion() throws SQLException {
        return DriverManager.getConnection(URL,USER,PASSWORD);
        
    }
}
