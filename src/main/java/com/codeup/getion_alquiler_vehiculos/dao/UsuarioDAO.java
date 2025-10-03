/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeup.getion_alquiler_vehiculos.dao;

import com.codeup.getion_alquiler_vehiculos.config.ConexionBD;
import com.codeup.getion_alquiler_vehiculos.modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Coder
 */
public class UsuarioDAO {
    public static void guardarUsuario(Usuario usuario) throws SQLException{
        
        String sql = "INSERT INTO Usuarios(nombre, email, telefono) VALUES (?,?,?)";
        
        try (Connection conn = ConexionBD.getConexion(); 
                PreparedStatement ps = conn.prepareStatement(sql,java.sql.Statement.RETURN_GENERATED_KEYS)){
                ps.setString(1, usuario.getNombre());
                ps.setString(2, usuario.getEmail());
                ps.setString(3, usuario.getTelefono());
                
                
                ps.executeUpdate();
            
        }             
    }
    
       /*public static List<Usuario> verUsuarios() throws SQLException{
        
        String sql = "SELECT * FROM Usuarios";
        
        List<Usuario> Usuarios = new ArrayList<>();
           try (Connection conn = ConexionBD.getConexion();
                 Statement ps = conn.createStatement();
                 ResultSet rs = ps.executeQuery(sql)) {
                
                while (rs.next()) {
                    
                }
            }
                   
    }*/
       
       public static void editarUsuario(Usuario usuario) throws SQLException{
        
        String sql = "UPDATE Usuarios SET nombre = ? , email = ? , telefono = ? WHERE id = ?";
        
        try (Connection conn = ConexionBD.getConexion(); 
                PreparedStatement ps = conn.prepareStatement(sql)){
                ps.setString(1, usuario.getNombre());
                ps.setString(2, usuario.getEmail());
                ps.setString(3, usuario.getTelefono());
                //ps.setString(4, usuario.getId());
                 
                ps.executeUpdate();
        }         
    }
       
       public static void buscarUsuariosporNombre(Usuario usuario) throws SQLException{
        
        String sql = "SELECT * FROM Usuarios WHERE nombre = ?";
                   
    }
       
       public static void buscarUsuariosporEmail(Usuario usuario) throws SQLException{
        
        String sql = "SELECT * FROM Usuarios WHERE email = ?";
                   
    }
       
       public static void buscarUsuariosporTelefono(Usuario usuario) throws SQLException{
        
        String sql = "SELECT * FROM Usuarios WHERE telefono = ?";
                   
    }
       
       public static void EliminarUsuariosporNombre(Usuario usuario) throws SQLException{
        
        String sql = "DELETE FROM Usuarios WHERE nombre = ?";
                   
    }
}
