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
    private List<TipodeControl> controles;

    public TrazaControl(int id, List<TipodeControl> controles, int muestr) {
        this.id = id;
        this.muestra = muestr;
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

    @Override
    public String toString() {
        return "TrazaControl{" + "id=" + id + ", muestra=" + muestra + ", controles=" + controles + '}';
    }

    
    

}
