/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ErroresPorTraza;

import java.util.List;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class TrazaControl {

    private int id;
    private int muestra;
    private int estado;
    private List<TipodeControl> controles;

    public TrazaControl(int id, int muestra, int estado, List<TipodeControl> controles) {
        this.id = id;
        this.muestra = muestra;
        this.estado = estado;
        this.controles = controles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<TipodeControl> getControles() {
        return controles;
    }

    public void setControles(List<TipodeControl> controles) {
        this.controles = controles;
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

    public int iterar(String nombre) {
        int total = 0;
        for (TipodeControl controle : controles) {
            if (controle.getNombre().equals(nombre)) {
                total = controle.getCantidad();
            }
        }
        return total;
    }

    @Override
    public String toString() {
        return "TrazaControl{" + "id=" + id + ", muestra=" + muestra + ", estado=" + estado + ", controles=" + controles + '}';
    }

}
