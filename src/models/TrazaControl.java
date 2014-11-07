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
public class TrazaControl {

    private int id;
    private int muestra;
    private int estado;

    public TrazaControl(int id, int muestra, int estado) {
        this.id = id;
        this.muestra = muestra;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMuestra() {
        return muestra;
    }

    public void setMuestra(int muestra) {
        this.muestra = muestra;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "TrazaControl{" + "id=" + id + ", muestra=" + muestra + ", estado=" + estado + '}';
    }

}
