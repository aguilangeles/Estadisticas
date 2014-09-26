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
public class Sublote {
    private int id;
    private int idTraza;
    private String ruta;
    private int totalImage;
    private int estado;

    public Sublote(int id, int idTraza, String ruta, int totalImage, int estado) {
        this.id = id;
        this.idTraza = idTraza;
        this.ruta = ruta;
        this.totalImage = totalImage;
        this.estado = estado;
    }

  

    public Sublote() {
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

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public int getTotalImage() {
        return totalImage;
    }

    public void setTotalImage(int totalImage) {
        this.totalImage = totalImage;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Sublote{" + "id=" + id + ", idTraza=" + idTraza + ", ruta=" + ruta + ", totalImage=" + totalImage + ", estado=" + estado + '}';
    }
    
    
    
    
}
