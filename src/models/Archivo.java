/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class Archivo {
    
    private int id;
    private int idTraza;
    private String rutaArchivo;
    private int estado;
    private int paginaPdf;
    private int idCategoria;

    public Archivo(int id, int idTraza, String rutaArchivo, int estado, int paginaPdf, int idCategoria) {
        this.id = id;
        this.idTraza = idTraza;
        this.rutaArchivo = rutaArchivo;
        this.estado = estado;
        this.paginaPdf = paginaPdf;
        this.idCategoria = idCategoria;
    }

    public Archivo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdTraza() {
        return idTraza;
    }

    public void setIdTraza(int idTraza) {
        this.idTraza = idTraza;
    }

    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getPaginaPdf() {
        return paginaPdf;
    }

    public void setPaginaPdf(int paginaPdf) {
        this.paginaPdf = paginaPdf;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Override
    public String toString() {
        return "Archivo{" + "id=" + id + ", idTraza=" + idTraza + ", rutaArchivo=" + rutaArchivo + ", estado=" + estado + ", paginaPdf=" + paginaPdf + ", idCategoria=" + idCategoria + '}';
    }
    
    
}
