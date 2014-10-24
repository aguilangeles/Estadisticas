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
    private List<TipodeControl> controles;

    public TrazaControl(int id, List<TipodeControl> controles) {
        this.id = id;
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

    @Override
    public String toString() {
        return "TrazaControl{" + "id=" + id + ", controles=" + controles + '}';
    }
    
    
}
