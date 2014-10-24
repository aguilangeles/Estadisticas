/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ErroresPorTraza;

import java.util.List;
import models.Filtro;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class TotalErrores {
    private int id;
    private List<TrazaControl> trazacontrol;
    private Filtro filtrosaplicados;

    public TotalErrores(int id, List<TrazaControl> trazacontrol, Filtro filtrosaplicados) {
        this.id = id;
        this.trazacontrol = trazacontrol;
        this.filtrosaplicados = filtrosaplicados;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<TrazaControl> getTrazacontrol() {
        return trazacontrol;
    }

    public void setTrazacontrol(List<TrazaControl> trazacontrol) {
        this.trazacontrol = trazacontrol;
    }

    public Filtro getFiltrosaplicados() {
        return filtrosaplicados;
    }

    public void setFiltrosaplicados(Filtro filtrosaplicados) {
        this.filtrosaplicados = filtrosaplicados;
    }

    @Override
    public String toString() {
        return "TotalErrores{" + "id=" + id + ", trazacontrol=" + trazacontrol + ", filtrosaplicados=" + filtrosaplicados + '}';
    }
    
    
    
}
