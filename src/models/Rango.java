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
public class Rango {
    private int id;
    private int minimo;
    private int maximo;
    private int muestra;
    private int rechazo;
    private int estado;

    public Rango(int id, int minimo, int maximo, int muestra, int rechazo, int estado) {
        this.id = id;
        this.minimo = minimo;
        this.maximo = maximo;
        this.muestra = muestra;
        this.rechazo = rechazo;
        this.estado = estado;
    }

    public Rango() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMinimo() {
        return minimo;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }

    public int getMaximo() {
        return maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    public int getMuestra() {
        return muestra;
    }

    public void setMuestra(int muestra) {
        this.muestra = muestra;
    }

    public int getRechazo() {
        return rechazo;
    }

    public void setRechazo(int rechazo) {
        this.rechazo = rechazo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Rangos{" + "id=" + id + ", minimo=" + minimo + ", maximo=" + maximo + ", muestra=" + muestra + ", rechazo=" + rechazo + ", estado=" + estado + '}';
    }
    
    
    
}
