/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jeicb
 */
public class Usuario {
    String username;
    String password;
    String rol;
    int intentos;
    String estado;
    public Usuario(String username, String password, String rol, int intentos, String estado) {
        this.username = username;
        this.password = password;
        this.rol = rol;
        this.intentos = intentos;
        this.estado = estado;
    }
}
