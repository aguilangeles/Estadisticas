/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class Usuario {
    private int usuarios;
    private String nombre;
    private int tipo;
    private int estado;
    private Date ultimoIngreso;

    public Usuario(int usuarios, String nombre, int tipo, int estado, Date ultimoIngreso) {
        this.usuarios = usuarios;
        this.nombre = nombre;
        this.tipo = tipo;
        this.estado = estado;
        this.ultimoIngreso = ultimoIngreso;
    }

    public Usuario() {
    }

    public int getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(int usuarios) {
        this.usuarios = usuarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Date getUltimoIngreso() {
        return ultimoIngreso;
    }

    public void setUltimoIngreso(Date ultimoIngreso) {
        this.ultimoIngreso = ultimoIngreso;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "usuarios=" + usuarios + ", nombre=" + nombre + ", tipo=" + tipo + ", estado=" + estado + ", ultimoIngreso=" + ultimoIngreso + '}';
    }
    
    
    
    
}
